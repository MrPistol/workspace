public class Main {

	public static final int GAME_FIELD_WIDTH = 20;
	public static final int GAME_FIELD_HEIGHT = 20;
	public static final char GAME_FIELD_EMPTY_CELL = '.';
	public static final char GAME_FIELD_MARK_CELL = '*';
	public static final char GAME_FIELD_TURTLE_RIGHT_CELL = '>';
	public static final char GAME_FIELD_TURTLE_UP_CELL = '^';
	public static final char GAME_FIELD_TURTLE_LEFT_CELL = '<';
	public static final char GAME_FIELD_TURTLE_DOWN_CELL = 'v';

	public static void main(String[] args) {
		GameField field = new GameField(GAME_FIELD_WIDTH,
				GAME_FIELD_HEIGHT,
				GAME_FIELD_EMPTY_CELL
		);
		Turtle fiestTurtle = new Turtle();
		Turtle secondTurtle = new Turtle(4, 5);
		Turtle[] turtles = {fiestTurtle, secondTurtle};

		secondTurtle.putPenDown();
		secondTurtle.turnRight();
		secondTurtle.move(5, field, GAME_FIELD_MARK_CELL);

		System.out.println(field.toString(
				turtles,
				GAME_FIELD_TURTLE_RIGHT_CELL
		));

	}
}
