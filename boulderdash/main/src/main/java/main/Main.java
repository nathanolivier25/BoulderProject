package main;

import java.io.File;

import controller.Controller;
import model.Model;
import view.View;

/**
 * <h1>The Class Main.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public abstract class Main {

    /**
     * The main method.
     * @param args
     *            the argument
     */
    public static void main(final String[] args) {

        final Controller controller = new Controller(new Model(1), new View());

    	View v = new View();
        final Controller controller = new Controller(new Model(5), v);
        controller.run();
        v.close();
    }

}
