package net.cubition.api;

public enum ChatColor {
	BLACK (0x0000),
	GREY_75 (0x00001),
	GREY_50 (0x00010),
	GREY_25 (0x00011),
	WHITE (0x00100),
	DARK_RED (0x00101),
	RED (0x00110),
	PINK (0x00111),
	BROWN (0x01000),
	GOLD (0x01001),
	ORANGE (0x01010),
	YELLOW (0x01011),
	LIGHT_YELLOW (0x01100),
	DARK_GREEN (0x01101),
	GREEN (0x01111),
	LIGHT_GREEN (0x10000),
	DARK_BLUE (0x10001),
	BLUE (0x10010),
	LIGHT_BLUE (0x10011),
	DARK_TURQOUISE (0x10100),
	TURQOUISE (0x10101),
	LIGHT_TURQOUISE (0x10101),
	DARK_PURPLE (0x10110),
	PURPLE (0x10111),
	LIGHT_PURPLE (0x11000);
	public int dat;
	ChatColor (int dat) {
		// TODO: Add method body
	}
}