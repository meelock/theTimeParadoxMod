package com.meelock.theTimeParadoxMod.worldgen;

import java.util.Random;

import com.meelock.theTimeParadoxMod.init.TPMBlocks;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Worldgen implements IWorldGenerator {

	@Override
	public void generate(Random rand, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		if (world.provider.dimensionId == 0) {
			int heightDiff = 7 - 1 + 1;
			for (int i = 0; i < 7; i++) {
				int x = chunkX * 16 + rand.nextInt(16);
				int y = 1 + rand.nextInt(heightDiff);
				int z = chunkZ * 16 + rand.nextInt(16);
				new WorldGenMinable(TPMBlocks.paradox, 2).generate(world, rand, x, y, z);
				
			}
			heightDiff = 3 - 1 + 1;
			for (int i = 0; i < 10; i++) {
				int x = chunkX * 16 + rand.nextInt(16);
				int y = 1 + rand.nextInt(heightDiff);
				int z = chunkZ * 16 + rand.nextInt(16);
				new WorldGenMinable(TPMBlocks.hardendparadox, 1).generate(world, rand, x, y, z);
			}
		}
	}

}
