package org.jack.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.jack.model.User;
import org.jack.service.UserService;

import javax.annotation.Resource;
import java.io.File;

/**
 * Created by Administrator on 2017/12/12.
 */
public class HelloAction extends ActionSupport implements ModelDriven<User>{
    //定义上传的文件名，属性命名：jsp中文件字段的name属性+FileName
    private String photoFileName;
    //属性名和jsp中文件字段的name属性一致，该photo对象是一个临时文件
    private File photo;
    //获取上传文件的类型

    public String getPhotoFileName() {
        return photoFileName;
    }

    public void setPhotoFileName(String photoFileName) {
        this.photoFileName = photoFileName;
    }

    public File getPhoto() {
        return photo;
    }

    public void setPhoto(File photo) {
        this.photo = photo;
    }

    public String getPhotoContentType() {
        return photoContentType;
    }

    public void setPhotoContentType(String photoContentType) {
        this.photoContentType = photoContentType;
    }

    private String photoContentType;

    @Resource
    UserService userService;


    private User user = new User();
    public User getModel() {
        return user;
    }

    public String index(){
        return "index";
    }

    public String reg(){
        return  "reg";
    }

    public String doReg(){
        String realPath = ServletActionContext.getServletContext().getRealPath("/img");
        userService.insert(user);
        return "login";
    }

    public String doLogin(){
        User login = userService.login(user.getUsername(),user.getPassword());
        if (login != null){
            return "index";
        } else {
            return "login";
        }
    }
}
