package common.blocks;

import java.util.List;

import common.itemBlocks.IB_LapotronicEnergyUnit;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class Block_LapotronicEnergyUnit extends BaseGTUpdateableBlock {
	
	private static final Block_LapotronicEnergyUnit instance = new Block_LapotronicEnergyUnit();
	
	private IIcon iconBaseSide;
	private IIcon iconBaseTop;
	
	private IIcon iconLapoIVSide;
	private IIcon iconLapoIVTop;
	private IIcon iconLapoLuVSide;
	private IIcon iconLapoLuVTop;
	private IIcon iconLapoZPMSide;
	private IIcon iconLapoZPMTop;
	private IIcon iconLapoUVSide;
	private IIcon iconLapoUVTop;
	private IIcon iconUltimateSide;
	private IIcon iconUltimateTop;
	private IIcon iconReallyUltimateSide;
	private IIcon iconReallyUltimateTop;
	
	private Block_LapotronicEnergyUnit() {
		super(Material.iron);
	}
	
	public static Block registerBlock() {
		final String blockName = "kekztech_lapotronicenergyunit_block";
		instance.setBlockName(blockName);
		instance.setCreativeTab(CreativeTabs.tabMisc);
		instance.setHardness(5.0f);
		instance.setResistance(6.0f);
		GameRegistry.registerBlock(instance, IB_LapotronicEnergyUnit.class, blockName);
		
		return instance;
	}
	
	@Override
	public void registerBlockIcons(IIconRegister ir) {
		iconBaseSide = ir.registerIcon("kekztech:LSCBase_side");
		iconBaseTop = ir.registerIcon("kekztech:LSCBase_top");
		
		iconLapoIVSide = ir.registerIcon("kekztech:LapotronicEnergyUnit1_side");
		iconLapoIVTop = ir.registerIcon("kekztech:LapotronicEnergyUnit1_top");
		iconLapoLuVSide = ir.registerIcon("kekztech:LapotronicEnergyUnit2_side");
		iconLapoLuVTop = ir.registerIcon("kekztech:LapotronicEnergyUnit2_top");
		iconLapoZPMSide = ir.registerIcon("kekztech:LapotronicEnergyUnit3_side");
		iconLapoZPMTop = ir.registerIcon("kekztech:LapotronicEnergyUnit3_top");
		iconLapoUVSide = ir.registerIcon("kekztech:LapotronicEnergyUnit4_side");
		iconLapoUVTop = ir.registerIcon("kekztech:LapotronicEnergyUnit4_top");
		
		iconUltimateSide = ir.registerIcon("kekztech:UltimateEnergyUnit_side");
		iconUltimateTop = ir.registerIcon("kekztech:UltimateEnergyUnit_top");
		iconReallyUltimateSide = ir.registerIcon("kekztech:ReallyUltimateEnergyUnit_side");
		iconReallyUltimateTop = ir.registerIcon("kekztech:ReallyUltimateEnergyUnit_top");
	}
	
	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void getSubBlocks(Item par1, CreativeTabs par2CreativeTabs, List par3List) {
		// Multi casing
		par3List.add(new ItemStack(par1, 1, 0));
		// Lapo units IV - UV
		par3List.add(new ItemStack(par1, 1, 1));
		par3List.add(new ItemStack(par1, 1, 2));
		par3List.add(new ItemStack(par1, 1, 3));
		par3List.add(new ItemStack(par1, 1, 4));
		// Ultimate batteries
		par3List.add(new ItemStack(par1, 1, 5));
		par3List.add(new ItemStack(par1, 1, 6));
	}
	
	@Override
	public IIcon getIcon(int side, int meta) {
		switch(meta) {
		case 0: return (side < 2) ? iconBaseTop : iconBaseSide;
		case 1: return (side < 2) ? iconLapoIVTop : iconLapoIVSide;
		case 2: return (side < 2) ? iconLapoLuVTop : iconLapoLuVSide;
		case 3: return (side < 2) ? iconLapoZPMTop : iconLapoZPMSide;
		case 4: return (side < 2) ? iconLapoUVTop : iconLapoUVSide;
		case 5: return (side < 2) ? iconUltimateTop : iconUltimateSide;
		case 6: return (side < 2) ? iconReallyUltimateTop : iconReallyUltimateSide;
		default: return iconUltimateTop;
		}
	}
	
}