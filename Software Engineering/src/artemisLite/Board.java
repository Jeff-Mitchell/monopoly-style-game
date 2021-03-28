/**
 * 
 */
package artemisLite;

import java.util.ArrayList;

/**
 * @author stu_m
 *
 */
public class Board {

	protected static final int NUM_SQUARES = 12;
	protected static final int EXPLORATION_GROUND_SYSTEMS_RENT = 50; 
	protected static final int SPACE_LAUNCH_SYSTEMS_RENT = 100; 
	protected static final int ORION_RENT = 150; 
	protected static final int LANDING_EQUIPMENT_RENT = 200; 
	/**
	 * Returns an arraylist populated with the elements for the board
	 * 
	 * @return
	 */
	public static ArrayList<Square> createBoard() {
		ArrayList<Square> board = new ArrayList<>(NUM_SQUARES);
		// create go square and add to board at index 0
		Go go = new Go(0);
		board.add(go);
		// creating elements for system A exploration ground system and adding to index
		// 1-3
		Square launchPad = new Element(1, ElementName.LAUNCH_PAD_39B, ElementType.EXPLORATION_GROUND_SYSTEMS, EXPLORATION_GROUND_SYSTEMS_RENT);
		Square vAB = new Element(2, ElementName.VEHICLE_ASSEMBLY_BUILDING, ElementType.EXPLORATION_GROUND_SYSTEMS, EXPLORATION_GROUND_SYSTEMS_RENT);
		Square youngCrippen = new Element(3, ElementName.YOUNG_CRIPPEN_FIRING_ROOM,
				ElementType.EXPLORATION_GROUND_SYSTEMS, EXPLORATION_GROUND_SYSTEMS_RENT);
		board.add(launchPad);
		board.add(vAB);
		board.add(youngCrippen);
		// creating elements for system B Space Launch systems and adding to index 4-5
		Square rS25Engines = new Element(4, ElementName.RS_25_ENGINES, ElementType.SPACE_LAUNCH_SYSTEMS, SPACE_LAUNCH_SYSTEMS_RENT);
		Square boosters = new Element(5, ElementName.BOOSTERS, ElementType.SPACE_LAUNCH_SYSTEMS, SPACE_LAUNCH_SYSTEMS_RENT);
		board.add(rS25Engines);
		board.add(boosters);
		// creating Chance square and add to index 6
		Square chance = new Chance(6);
		board.add(chance);
		// creating elements for system C Orion and add to 7-9
		Square serviceModule = new Element(7, ElementName.SERVICE_MODULE, ElementType.ORION, ORION_RENT);
		Square crewModule = new Element(8, ElementName.CREW_MODULE, ElementType.ORION, ORION_RENT);
		Square launchAbortSystem = new Element(9, ElementName.LAUNCH_ABORT_SYSTEM, ElementType.ORION, ORION_RENT);
		board.add(serviceModule);
		board.add(crewModule);
		board.add(launchAbortSystem);
		// creating elements for systems D landing equipment and add to index 10-11
		Square lunarLander = new Element(10, ElementName.LUNAR_LANDERS, ElementType.LANDING_EQUIPMENT, LANDING_EQUIPMENT_RENT);
		Square artemisGenSpacesuit = new Element(11, ElementName.ARTEMIS_GENERATION_SPACESUITS,
				ElementType.LANDING_EQUIPMENT, LANDING_EQUIPMENT_RENT);
		board.add(lunarLander);
		board.add(artemisGenSpacesuit);

		return board;
	}

}
