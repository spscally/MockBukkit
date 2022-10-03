package be.seeseemelk.mockbukkit.block.data;

import com.google.common.base.Preconditions;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.BlockFace;
import org.bukkit.block.data.type.TrapDoor;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class TrapDoorMock extends BlockDataMock implements TrapDoor
{

	public TrapDoorMock(@NotNull Material type)
	{
		super(type);
		checkType(type, Tag.TRAPDOORS);
		setHalf(Half.BOTTOM);
		setOpen(false);
		setPowered(false);
		setWaterlogged(false);
		setFacing(BlockFace.NORTH);
	}

	@Override
	public @NotNull Half getHalf()
	{
		return get(HALF_KEY);
	}

	@Override
	public void setHalf(@NotNull Half half)
	{
		Preconditions.checkNotNull(half, "Half cannot be null");
		set(HALF_KEY, half);
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
		return getCardinalFaces();
	}

	@Override
	public boolean isOpen()
	{
		return get(OPEN_KEY);
	}

	@Override
	public void setOpen(boolean open)
	{
		set(OPEN_KEY, open);
	}

	@Override
	public boolean isPowered()
	{
		return get(POWERED_KEY);
	}

	@Override
	public void setPowered(boolean powered)
	{
		set(POWERED_KEY, powered);
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
