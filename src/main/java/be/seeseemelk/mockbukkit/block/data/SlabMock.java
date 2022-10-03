package be.seeseemelk.mockbukkit.block.data;

import com.google.common.base.Preconditions;
import org.bukkit.Material;
import org.bukkit.Tag;
import org.bukkit.block.data.type.Slab;
import org.jetbrains.annotations.NotNull;

public class SlabMock extends BlockDataMock implements Slab
{

	public SlabMock(@NotNull Material type)
	{
		super(type);
		checkType(type, Tag.SLABS);
		setType(Type.BOTTOM);
		setWaterlogged(false);
	}

	@Override
	public @NotNull Type getType()
	{
		return get(TYPE_KEY);
	}

	@Override
	public void setType(@NotNull Type type)
	{
		Preconditions.checkNotNull(type, "Type cannot be null");
		set(TYPE_KEY, type);
	}

	@Override
	public boolean isWaterlogged()
	{
		return super.get(WATERLOGGED_KEY);
	}

	@Override
	public void setWaterlogged(boolean waterlogged)
	{
		super.set(WATERLOGGED_KEY, waterlogged);
	}

}
