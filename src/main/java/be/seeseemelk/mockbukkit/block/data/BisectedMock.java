package be.seeseemelk.mockbukkit.block.data;

import com.google.common.base.Preconditions;
import org.bukkit.Material;
import org.bukkit.block.data.Bisected;
import org.jetbrains.annotations.NotNull;

public class BisectedMock extends BlockDataMock implements Bisected
{

	protected BisectedMock(@NotNull Material type) {
		super(type);
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

}
