package Assignment9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Formatter;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {

private List<String> list=new ArrayList<String>();

public Assignment9(List<String> l){
    list=l;
}

public void setList(List<String> l){
    list=l;
}

public void parse(String regex){
    Pattern p=Pattern.compile(regex);
    Matcher m;
    Formatter f=new Formatter(System.out);
    for(String str:list){
        m=p.matcher(str);
        f.format("%1$-15.15s %2$-8.8s\n",str,m.find());
    }
}

    public static void main(String[] args) {
        Assignment9 as=new Assignment9(Arrays.asList("hello world!","Hello Words.","Hellow words!","HELLOW WORLD."));

        String regex="^[A-Z].*\\.";
        as.parse(regex);
    }
}
