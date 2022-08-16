package org.mineacademy.template;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.player.PlayerInteractEntityEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.mineacademy.fo.plugin.SimplePlugin;
import org.mineacademy.fo.remain.CompMaterial;
import org.mineacademy.fo.remain.Remain;

import java.sql.SQLOutput;

/**
 * PluginTemplate is a simple template you can use every time you make
 * a new plugin. This will save you time because you no longer have to
 * recreate the same skeleton and features each time.
 *
 * It uses Foundation for fast and efficient development process.
 */
public final class PluginTemplate extends SimplePlugin {

	/**
	* Automatically perform login ONCE when the plugin starts.
	*/
	@Override
	protected void onPluginStart() {

		System.out.println("systest");

		for (int number = 2; number < 10; number++) {
			System.out.println("Number for " + number);
		} //Logic in FOR is always performed after all of the code

		int[] playerIds = new int[] { 1, 2, 3, 4 };

		for (int playerId : playerIds){
			System.out.println("Id: " + playerId);
		}
		//W2D7

		int apples = 5;
		apples++;
		System.out.println(apples);

		int demo = 50;
		int demo2 = 10;

		boolean demoresult = demo == demo2; // == can be only used to compare numbers. Do not use for strings
		System.out.println(demoresult);

		boolean stringresult = "hello".equals("hello"); // use this instead
		System.out.println(stringresult);

		if (demo < demo2) {
			System.out.println("demo is smaller than demo2"); //You can delete the brackets if it is one line. STILL USE FOR CLARITY!!!
		}
		else {
			System.out.println("demo isn't smaller than demo2");
		}

		int result = 4;
		System.out.println(result);

		result = result + 5;
		System.out.println(result);

		result = result * 2;
		System.out.println(result);
									//W2D6
		System.out.println("systest6");


		/* lets try multiple lines
	      1
		  2
		 */




	}

	/* ------------------------------------------------------------------------------- */
	/* Events */
	/* ------------------------------------------------------------------------------- */

	/**
	 * An example event that checks if the right clicked entity is a cow, and makes an explosion.
	 * You can write your events to your main class without having to register a listener.
	 *
	 * @param event
	 */
	@EventHandler
	public void onRightClickAnything(PlayerInteractEvent event) {
		System.out.println("We've started handling clicking event");

		if (event.getClickedBlock().getType() == CompMaterial.GRASS_BLOCK.getMaterial()){
			handleClickingGrass(event.getClickedBlock(), event.getPlayer());
		}

		System.out.println("Done!");
	}
	void handleClickingGrass(Block block, Player player) {
		block.setType(CompMaterial.DIAMOND_BLOCK.getMaterial());

		player.sendMessage("BLING BLING");
	}

}