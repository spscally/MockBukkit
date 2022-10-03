package be.seeseemelk.mockbukkit.block.data;

import com.google.common.base.Preconditions;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.Stairs;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class StairsMock extends BisectedMock implements Stairs
{

	public StairsMock(@NotNull Material type)
	{
		super(type);
		checkType(type, Tag.STAIRS);
		setShape(Shape.STRAIGHT);
		setWaterlogged(false);
		setFacing(BlockFace.NORTH);
		setHalf(Half.BOTTOM);
	}

	@Override
	public @NotNull Shape getShape()
	{
		return get(SHAPE_KEY);
	}

	@Override
	public void setShape(@NotNull Shape shape)
	{
		Preconditions.checkNotNull("Shape cannot be null");
		set(SHAPE_KEY, shape);
	}

	@Override
	public @NotNull BlockFace getFacing()
	{
		return get(FACING_KEY);
	}

	@Override
	public void setFacing(@NotNull BlockFace facing)
	{
		Preconditions.checkNotNull(facing, "BlockFace cannot be null");
		Preconditions.checkArgument(getFaces().contains(facing), "Invalid face. Must be one of " + getFaces());
		set(FACING_KEY, facing);
	}

	@Override
	public @NotNull Set<BlockFace> getFaces()
	{
		return Set.of(BlockFace.NORTH, BlockFace.SOUTH, BlockFace.WEST, BlockFace.EAST);
	}

	@Override
	public boolean isWaterlogged()
	{
		return get(WATERLOGGED_KEY);
	}

	@Override
	public void setWaterlogged(boolean waterlogged)
	{
		set(WATERLOGGED_KEY, waterlogged);
	}

}
