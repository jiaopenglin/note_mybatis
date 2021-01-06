package note.mybatis.demo;

import note.mybatis.plugins.ExecutorIntercepor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.PluginException;
import org.apache.ibatis.plugin.Signature;

import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Set;

public class Demo1 {


    public static void main(String[] args) {


        Intercepts interceptsAnnotation = ExecutorIntercepor.class.getAnnotation(Intercepts.class);
        Signature[] sigs = interceptsAnnotation.value();
        for (Signature s: sigs
             ) {
            System.out.println(s.args());
            System.out.println(s.method());
            System.out.println(s.type());


        }
    }
}
