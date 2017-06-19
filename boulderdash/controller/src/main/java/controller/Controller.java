package controller;

import java.time.Clock;

import contract.IModel;
import contract.IView;

public class Controller 
{
	private boolean running;
	private IModel model;
	private IView view;
	private Clock clock;
}
