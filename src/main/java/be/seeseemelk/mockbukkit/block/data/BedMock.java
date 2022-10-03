package be.seeseemelk.mockbukkit.block.data;

import com.destroystokyo.paper.MaterialTags;
import org.bukkit.Material;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.Bed;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class BedMock extends BlockDataMock implements Bed
{

	public BedMock(@NotNull Material type)
	{
		super(type);
		checkType(type, MaterialTags.BEDS);
		this.setFacing(BlockFace.NORTH);
		super.set(OCCUPIED_KEY, false);
		this.setPart(Part.FOOT);
	}

	@Override
	public @NotNull Part getPart()
	{
		return super.get(PART_KEY);
	}

	@Override
	public void setPart(@NotNull Part part)
	{
		super.set(PART_KEY, part);
	}

	@Override
	public boolean isOccupied()
	{
		return super.get(OCCUPIED_KEY);
	}

	@Override
	public @NotNull BlockFace getFacing()
	{
		return super.get(FACING_KEY);
	}

	@Override
	public void setFacing(@NotNull BlockFace facing)
	{

		if (!getFaces().contains(facing))
		{
			throw new IllegalArgumentException("Invalid face: " + facing);
		}
		super.set(FACING_KEY, facing);
	}

	@Override
	public @NotNull Set<BlockFace> getFaces()
	{
		return Set.of(BlockFace.NORTH, BlockFace.EAST, BlockFace.SOUTH, BlockFace.WEST);
	}

}
