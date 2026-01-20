/**
 * 
 */
package com.capgemini.blue_lotter_ticket;

/**
 * 
 */

public interface JavaApplication {

	public static void execution() {
		BlueLotteryTicket bl=new BlueLotteryTicket();
		System.out.println(bl.blueLottery(5, 5, 4));
	}
	
}
;