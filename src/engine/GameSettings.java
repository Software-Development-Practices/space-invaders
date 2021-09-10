package engine;

/**
 * Implements an object that stores a single game's difficulty settings.
 * 단일 게임의 난이도 설정을 저장하는 개체를 구현합니다.
 * 
 * @author <a href="mailto:RobertoIA1987@gmail.com">Roberto Izquierdo Amo</a>
 * 
 */
public class GameSettings {

	/** Width of the level's enemy formation.
	 * 레벨의 적 포메이션의 너비입니다. */
	private int formationWidth;
	/** Height of the level's enemy formation.
	 * 레벨의 적 포메이션의 높이입니다. */
	private int formationHeight;
	/** Speed of the enemies, function of the remaining number.
	 * 적들의 속도, 남은 숫자의 기능. */
	private int baseSpeed;
	/** Frequency of enemy shootings, +/- 30%.
	 * 적의 총격 빈도, +/- 30%. */
	private int shootingFrecuency;

	/**
	 * Constructor.
	 * 
	 * @param formationWidth
	 *            Width of the level's enemy formation.
	 * @param formationHeight
	 *            Height of the level's enemy formation.
	 * @param baseSpeed
	 *            Speed of the enemies.
	 * @param shootingFrecuency
	 *            Frecuency of enemy shootings, +/- 30%.
	 */
	public GameSettings(final int formationWidth, final int formationHeight,
			final int baseSpeed, final int shootingFrecuency) {
		this.formationWidth = formationWidth;
		this.formationHeight = formationHeight;
		this.baseSpeed = baseSpeed;
		this.shootingFrecuency = shootingFrecuency;
	}

	/**
	 * @return the formationWidth
	 */
	public final int getFormationWidth() {
		return formationWidth;
	}

	/**
	 * @return the formationHeight
	 */
	public final int getFormationHeight() {
		return formationHeight;
	}

	/**
	 * @return the baseSpeed
	 */
	public final int getBaseSpeed() {
		return baseSpeed;
	}

	/**
	 * @return the shootingFrecuency
	 */
	public final int getShootingFrecuency() {
		return shootingFrecuency;
	}

}
