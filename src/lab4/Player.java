package lab4;

public class Player
{
    public enum Speed {
	SLOW(5), MEDIUM(10), FAST(20);

	private final int speed;

    	Speed(final int speed) {
	    this.speed = speed;
	}
    }

    public enum Mode {
	NORMAL("Normal"), GHOST("Ghost"), INVULNERABLE("Invulnerable");

	private final String mode;

	Mode(final String mode) {
	    this.mode = mode;
	}
    }

    private int x, y;
    private Speed speed = Speed.MEDIUM;
    private Mode mode = Mode.NORMAL;

    public int getSpeed() {
        return speed.speed;
    }

    public void setSpeed(final Speed speed) {
        this.speed = speed;
    }

    public String getMode() {
        return mode.mode;
    }

    public void setMode(final Mode mode) {
        this.mode = mode;
    }

    public void moveRight() {
        x += speed.speed;
    }

    /**
     * Describe current speed and mode -- used for a status display
     */
    public String getDescription() {
        StringBuilder buf = new StringBuilder();
        buf.append("Player is ");

	buf.append(speed);

        buf.append(" and ");

	buf.append(mode);

        return buf.toString();
    }

    public static void main(String[] args) {
        final Player player = new Player();
        System.out.println(player.getDescription());
    }
}