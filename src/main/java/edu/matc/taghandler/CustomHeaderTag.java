package edu.matc.taghandler;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by netherskub on 10/26/16.
 */
public class CustomHeaderTag extends SimpleTagSupport {

    @Override
    public void doTag() throws JspException, IOException {
        super.doTag();
        JspWriter out = getJspContext().getOut();

        Date today = new Date();
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy/MM/dd");
        String todayFormat = formatDate.format(today);


        if (todayFormat.equals("2016/10/31"))
        {
            out.println("Hello, welcome to HELL");
        }
        else
        {
            out.println("Welcome to my project");
        }

    }
}
