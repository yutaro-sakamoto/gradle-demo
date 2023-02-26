/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.demo.app;

import gradle.demo.list.LinkedList;

import static gradle.demo.utilities.StringUtils.join;
import static gradle.demo.utilities.StringUtils.split;
import static gradle.demo.app.MessageUtils.getMessage;

import org.apache.commons.text.WordUtils;

public class App {
    public String getGreeting() {
        return "Hello World";
    }


    public static void main(String[] args) {
        LinkedList tokens;
        tokens = split(getMessage());
        String result = join(tokens);
        System.out.println(WordUtils.capitalize(result));
    }
}
