package javademo.java9.modules;

/**
 * Java 9 module system (JPMS) uses {@code module-info.java} at module boundaries.
 * <p>
 * Example module descriptor:
 * <pre>{@code
 * module com.example.app {
 *     requires java.logging;
 *     exports com.example.app.api;
 * }
 * }</pre>
 * Run {@code jshell} from the command line for the Java 9 REPL (not invoked from this class).
 */
public class ModuleSystemDemo {
    public static void main(String[] args) {
        Module module = ModuleSystemDemo.class.getModule();
        System.out.println("This class module: " + module.getName());
        System.out.println("java.base exported packages include: " +
                module.getLayer().findModule("java.base").orElseThrow().getDescriptor().name());
        System.out.println("JShell: run `jshell` in terminal for interactive snippets.");
    }
}
