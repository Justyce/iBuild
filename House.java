package just.Justyce;

import java.util.ArrayList;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.block.Block;

public class House {
	//@param w is the world of the location for register block
	//@param loc is the location of the player because the house is building around the player
	public static void BuildaHouse(Location loc,World w) {
//Register
		//Register arrayList of Block
		ArrayList<Block> wood = new ArrayList<Block>();
	//	ArrayList<Block> woodstairs = new ArrayList<Block>();
	//	ArrayList<Block> glasspane = new ArrayList<Block>();
		//Register Blocks & modify the location for wood
		loc.add(loc.getX(), loc.getY(), loc.getZ());
		Block b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX()-1, loc.getY(), loc.getZ());
		Block b1 =w.getBlockAt(loc);
		wood.add(b1);
		loc.add(loc.getX()-1, loc.getY(), loc.getZ());
		Block b2 =w.getBlockAt(loc);
		wood.add(b2);
		loc.add(loc.getX()-1, loc.getY(), loc.getZ());
		Block b3 =w.getBlockAt(loc);
		wood.add(b3);
		//line 1
		loc.add(loc.getX()-1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		//line 2
		loc.add(loc.getX()+1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		//line 3
		loc.add(loc.getX()+1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		//line 4
		loc.add(loc.getX()+1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()-1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		//walls
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX()+1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()-1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()-1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()-1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()-1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()-1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY(), loc.getZ()+1);
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		
		
		loc.add(loc.getX()-1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()-1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX()-1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX()-1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()-1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX()-1, loc.getY(), loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		loc.add(loc.getX(), loc.getY()+1, loc.getZ());
		b0 =w.getBlockAt(loc);
		wood.add(b0);
		
		
		
//Making
		//Making wood !! id
		int size = wood.size();
		for(int z = -1;z<size;z++){
			Block b = wood.get(z);
			b.setTypeId(05);
		}
		//Making woodstairs !! id
	/*	size = woodstairs.size();
		for(int z = -1;z<size;z++){
			Block b = woodstairs.get(z);
			b.setTypeId(14);
		}
		//Making glasspane !! id
		size = glasspane.size();
		for(int z = -1;z<size;z++){
			Block b = glasspane.get(z);
			b.setTypeId(14);
	*///	}
	}
}
