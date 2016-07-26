package com.ssa.adventure;

import java.util.Scanner;

public class AdventureStory
{

	private Scanner sc = new Scanner(System.in);
	private boolean readStory = true;

	public AdventureStory()
	{

	}

	public void startStory()
	{
		while (readStory)
		{
			System.out.println(
					"HELLO FRIEND, TIME FOR CLASS! DO YOU WANT TO STAY HOME, GO TO CLASS, IGNITE YOUR LIGHTSABER, OR END THE STORY?");
			System.out.println("\tHOME\tCLASS\tLIGHTSABER\tEND");

			String initialInput = sc.nextLine().toLowerCase();

			switch (initialInput)
			{
			case "home":
				goHome();
				break;
			case "class":
				goToClass();
				break;
			case "lightsaber":
				useLightsaber();
				break;
			case "end":
				readStory = false;
				break;
			default:
				System.out.println("BAD INPUT. RESTARTING STORY.\n");
			}
		}
		System.out.println("\nTHE STORY IS OVER!!");
	}

	private void goHome()
	{
		System.out.println("Go back to SLEEP OR go find a JOB?\n\tSLEEP\tJOB");
		String secondInput = sc.nextLine().toLowerCase();

		switch (secondInput)
		{
		case "sleep":
			System.out.println("You drift off into a coma.\n");
			break;
		case "job":
			System.out.println("You find a new job and apply for it.");
			readStory = false;
			break;
		default:
			System.out.println("BAD INPUT. STORY OVER\n");
		}

	}

	private void goToClass()
	{
		System.out.println("Pay ATTENTION OR browse the INTERNET during class?\n\tATTENTION\tINTERNET");
		String secondInput = sc.nextLine().toLowerCase();

		switch (secondInput)
		{
		case "attention":
			System.out.println("You pass the class.");
			readStory = false;
			break;
		case "internet":
			System.out.println("You fail the class.\n");
			break;
		default:
			System.out.println("BAD INPUT. STORY OVER\n");
		}
	}

	private void useLightsaber()
	{
		System.out.println("Become a JEDI OR become a PAPERBOY?\n\tJEDI\tPAPERBOY");
		String secondInput = sc.nextLine().toLowerCase();

		switch (secondInput)
		{
		case "jedi":
			System.out.println("You save the worlds.");
			readStory = false;
			break;
		case "paperboy":
			System.out.println("You deliver on Sundays.\n");
			break;
		default:
			System.out.println("BAD INPUT. STORY OVER\n");
		}
	}

	public static void main(String[] args)
	{
		AdventureStory story = new AdventureStory();
		story.startStory();
	}
}
