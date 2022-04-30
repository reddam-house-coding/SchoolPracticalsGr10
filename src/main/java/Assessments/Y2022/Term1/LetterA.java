/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Assessments.Y2022.Term1;

import it.*;
import java.awt.*;

/**
 *
 * @author Cliftonb
 */
public class LetterA {

	public static void main(String[] args) {
		Gogga bug = new Gogga();

		bug.setColor(Color.GREEN);
		bug.setTrailWidth(25);

		bug.setPosition(4, 7);
		bug.setDirection(Gogga.UP);

		bug.move();
		bug.move();
		bug.move();
		bug.move();
		bug.move();

		bug.turnRight();

		bug.move();
		bug.move();
		bug.move();

		bug.turnRight();

		bug.move();
		bug.move();
		bug.move();
		bug.move();
		bug.move();

		bug.setPosition(4, 4);
		bug.setDirection(Gogga.RIGHT);

		bug.move();
		bug.move();
		bug.move();
	}
}
