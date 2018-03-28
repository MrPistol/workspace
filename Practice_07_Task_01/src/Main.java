import java.util.Scanner;
import java.util.InputMismatchException;

public class Main
	{
		
		/*Game Field*/
		public static final int GAME_FIELD_WIDTH = 20;
		public static final int GAME_FIELD_HEIGHT = 20;
		public static final char GAME_FIELD_EMPTY_CELL = '.';
		public static final char GAME_FIELD_MARK_CELL = '*';
		public static final char GAME_FIELD_TURTLE_RIGHT_CELL = '>';
		public static final char GAME_FIELD_TURTLE_UP_CELL = '^';
		public static final char GAME_FIELD_TURTLE_LEFT_CELL = '<';
		public static final char GAME_FIELD_TURTLE_DOWN_CELL = 'v';
		
		
		/*Commands*/
		public static final int COMMAND_PUT_PEN_DOWN = 1;
		public static final int COMMAND_PUT_PEN_UP = 2;
		public static final int COMMAND_TURN_RIGHT = 3;
		public static final int COMMAND_TURN_LEFT = 4;
		public static final int COMMAND_MOVE = 5;
		public static final int COMMAND_PRINT_GAME_FIELD = 6;
		public static final int COMMAND_RESET = 7;
		public static final int COMMAND_EXIT = 9;
		
		/*Turtle*/
		static int turtleX, turtleY;
		static int turtleDX, turtleDY;
		static boolean isTurtlesPenDown;
		static char directStatus = '>';
		
		
		
		/*Game Field*/
		
		public static char[][] createGameField(
				int width,
				int height,
				char emptyCellValue
		                                      )
			{
				char[][] gameField = new char[width][height];
				initGameField(gameField, width, height, emptyCellValue);
				return gameField;
			}
		
		public static void initGameField(
				char[][] gameField,
				int width, int height,
				char emptyCellValue
		                                )
			{
				for (int x = 0; x < width; ++x)
					{
						
						for (int y = 0; y < height; ++y)
							{
								gameField[x][y] = emptyCellValue;
							}
					}
			}
		
		public static String convertGameFieldToString(
				char[][] gameField,
				char turtleCell
		                                             )
			{
				StringBuilder result = new StringBuilder("");
				
				for (int y = 0; y < gameField.length; ++y)
					{
						
						for (int x = 0; x < gameField[0].length; ++x)
							{
								if (y == turtleY && x == turtleX)
									{
										
										result.append(turtleCell);
									} else
									{
										result.append(gameField[x][y]);
									}
							}
						result.append('\n');
					}
				return result.toString();
			}
		
		/*Turtle*/
		
		public static void initTurtle()
			{
				turtleX = turtleY = 0;
				turtleDX = 1;
				turtleDY = 0;
				isTurtlesPenDown = false;
			}
		
		public static void setDirectStatus()
			{
				if (turtleDX == 1 && turtleDY == 0)
					{
						directStatus = GAME_FIELD_TURTLE_RIGHT_CELL;
					} else if (turtleDX == 0 && turtleDY == -1)
					{
						directStatus = GAME_FIELD_TURTLE_UP_CELL;
					} else if (turtleDX == -1 && turtleDY == 0)
					{
						directStatus = GAME_FIELD_TURTLE_LEFT_CELL;
					} else if (turtleDX == 0 && turtleDY == 1)
					{
						directStatus = GAME_FIELD_TURTLE_DOWN_CELL;
					}
			}
		
		public static void putTurtlesPenDown()
			{
				isTurtlesPenDown = true;
			}
		
		public static void putTurtlesPenUp()
			{
				isTurtlesPenDown = false;
			}
		
		public static void ternTurtleRight()
			{
				int temp = turtleDX;
				turtleDX = turtleDY;
				turtleDY = temp;
				
				turtleDX *= -1;
				
			}
		
		public static void ternTurtleLeft()
			{
				int temp = turtleDX;
				turtleDX = turtleDY;
				turtleDY = temp;
				
				turtleDY *= -1;
			}
		
		public static void moveTurtle(
				int steps,
				char[][] gameField,
				char markedCellValues
		                             )
			{
				for (int i = 0; i < steps; ++i)
					{
						
						int nextX = turtleX + turtleDX;
						int nextY = turtleY + turtleDY;
						if (!(nextX >= 0 && nextX < gameField.length &&
								nextY >= 0 && nextY < gameField[0].length))
							{
								break;
							} else
							{
								
								if (isTurtlesPenDown)
									{
										gameField[turtleX][turtleY] = markedCellValues;
									}
								turtleX = nextX;
								turtleY = nextY;
							}
					}
				
			}
		
		
		/*  Commands  */
		
		public static void processCommand(char[][] gameField) throws Exception
			{
				Scanner scanner = new Scanner(System.in);
				if (!scanner.hasNextLine())
					{
						throw new Exception("Строка команды не была введена");
					}
				String stroke = scanner.nextLine();
				Scanner strokeScanner = new Scanner(stroke);
				
				if (!strokeScanner.hasNext())
					{
						throw new Exception("Команда не была введена");
					}
				
				int command;
				try
					{
						command = strokeScanner.nextInt();
					} catch (InputMismatchException e)
					{
						throw new Exception("Команда должна быть числом");
					}
				switch (command)
					{
						case COMMAND_PUT_PEN_DOWN:
							putTurtlesPenDown();
							break;
						case COMMAND_PUT_PEN_UP:
							putTurtlesPenUp();
							break;
						case COMMAND_TURN_RIGHT:
							ternTurtleRight();
							break;
						case COMMAND_TURN_LEFT:
							ternTurtleLeft();
							break;
						case COMMAND_MOVE:
							if (!strokeScanner.hasNext())
								{
									throw new Exception(
											"Количество шагов не было введено");
								}
							int steps;
							try
								{
									steps = strokeScanner.nextInt();
								} catch (InputMismatchException e)
								{
									throw new Exception(
											"Количество шагов должно быть числом");
								}
							
							if (steps < 0)
								{
									throw new Exception(
											"Количество шагов не может быть отрицательным");
								}
							moveTurtle(steps, gameField, GAME_FIELD_MARK_CELL);
							break;
						case COMMAND_PRINT_GAME_FIELD:
							setDirectStatus();
							System.out.println(convertGameFieldToString(
									gameField,
									directStatus
							                                           )
							                  );
							break;
						case COMMAND_RESET:
							resetGame(gameField, GAME_FIELD_EMPTY_CELL);
							break;
						
						case COMMAND_EXIT:
							System.exit(0);
						default:
							throw new Exception("Неверная команда");
					}
				
			}
		
		
		public static void resetGame(char[][] gameField, char emptyCellValue)
			{
				initGameField(
						gameField,
						gameField.length,
						gameField[0].length,
						emptyCellValue
				             );
				
				initTurtle();
				
			}
		
		
		/*Entry Point*/
		public static void main(String[] args)
			{
				
				char[][] gameField = createGameField(
						GAME_FIELD_WIDTH,
						GAME_FIELD_HEIGHT,
						GAME_FIELD_EMPTY_CELL
				                                    );
				initTurtle();
				
				while (true)
					{
						try
							{
								processCommand(gameField);
							} catch (Exception e)
							{
								System.err.println(e.getMessage());
							}
					}
				
				
			}
		
		
	}
