package melky.resourcepacks;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import net.runelite.api.annotations.Component;
import net.runelite.api.widgets.ComponentID;

@Getter
@RequiredArgsConstructor
public enum WidgetResize
{
	//was squished, due to default width and height set to 16x16 instead of 20x18 (fairy ring plug-in)
	FAIRY_RING_SEARCH_ICON(ComponentID.FAIRY_RING_PANEL_HEADER, null, null, null, null, 20, 18, 20, 18, 8),

	//close button was squished
	FOSSIL_POOL_HOPPER_CLOSE_BUTTON_PARENT(40173570, -2, -1, null, null, 26, null, 26, null, null),
	FOSSIL_POOL_HOPPER_CLOSE_BUTTON(40173570, -2, -1, null, null, 26, null, 26, null, 0),
	FOSSIL_POOL_HOPPER_CLOSE_BUTTON_HOVER(40173570, -2, -1, null, null, 26, null, 26, null, 1),

	//reposition border_left, 1 pixel to the right to fix being cut-off
	GRAND_EXCHANGE_OFFER_1_BORDER_LEFT(30474247, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_OFFER_2_BORDER_LEFT(30474248, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_OFFER_3_BORDER_LEFT(30474249, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_OFFER_4_BORDER_LEFT(30474250, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_OFFER_5_BORDER_LEFT(30474251, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_OFFER_6_BORDER_LEFT(30474252, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_OFFER_7_BORDER_LEFT(30474253, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_OFFER_8_BORDER_LEFT(30474254, -13, null, -14, null, null, null, null, null, 7),

	GRAND_EXCHANGE_COLLECTION_BOX_1_BORDER_LEFT(26345477, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_COLLECTION_BOX_2_BORDER_LEFT(26345478, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_COLLECTION_BOX_3_BORDER_LEFT(26345479, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_COLLECTION_BOX_4_BORDER_LEFT(26345480, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_COLLECTION_BOX_5_BORDER_LEFT(26345481, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_COLLECTION_BOX_6_BORDER_LEFT(26345482, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_COLLECTION_BOX_7_BORDER_LEFT(26345483, -13, null, -14, null, null, null, null, null, 7),
	GRAND_EXCHANGE_COLLECTION_BOX_8_BORDER_LEFT(26345484, -13, null, -14, null, null, null, null, null, 7),

	SPELL_FILTER_BORDER_LEFT(14287043, -13, null, -13, null, null, null, null, null, 2),

	PRAYER_FILTER_BORDER_LEFT(35454980, -13, null, -13, null, null, null, null, null, 2),

	MORE_INFO_PATH_BORDER_LEFT1(42074121, -13, null, -13, null, null, null, null, null, 2),
	MORE_INFO_PATH_BORDER_LEFT2(42074126, -13, null, -13, null, null, null, null, null, 2),

	PATH_BORDER_LEFT1(42074140, -13, null, -13, null, null, null, null, null, 2),
	PATH_BORDER_LEFT2(42074118, -13, null, -13, null, null, null, null, null, 2),

	PATH_REWARDS_BORDER_LEFT1(42139651, -12, null, -12, null, null, null, null, null, 18),
	PATH_REWARDS_BORDER_LEFT2(42139651, 60, null, 60, null, null, null, null, null, 27),

	TOB_LOBBY_PARTY_BORDER_LEFT(ComponentID.TOB_PARTY_INTERFACE, -13, null, -13, null, null, null, null, null, 2),
	TOA_LOBBY_PARTY_BORDER_LEFT(ComponentID.TOA_PARTY_LAYER, -13, null, -13, null, null, null, null, null, 2),

	SOUL_WARS_LOBBY_BORDER_LEFT(28442626, -13, null, -13, null, null, null, null, null, 2),
	SOUL_WARS_OVERLAY_BORDER_LEFT(24576007, -13, null, -13, null, null, null, null, null, 2),
	SOUL_WARS_CONTRIBUTION_BAR_BORDER_LEFT(24576003, -13, null, -13, null, null, null, null, null, 2),

	TEMPOROSS_LOBBY_BORDER_LEFT(ComponentID.TEMPOROSS_LOBBY_LOBBY, -13, null, -13, null, null, null, null, null, 2),

	XP_DROP_SETUP_TOP_BORDER_LEFT(8978436, -13, null, -13, null, null, null, null, null, 2),
	XP_DROP_SETUP_BOTTOM_BORDER_LEFT(8978447, -13, null, -13, null, null, null, null, null, 2),

	PVP_ARENA_SIDE_PANEL_OPTIONS_BORDER_LEFT(49741824, -13, null, -13, null, null, null, null, null, 2),
	;

	@Component
	private final int component;
	private final Integer modifiedX;
	private final Integer modifiedY;
	private final Integer originalX;
	private final Integer originalY;
	private final Integer modifiedWidth;
	private final Integer modifiedHeight;
	private final Integer originalWidth;
	private final Integer originalHeight;
	private final Integer childIndex;
}
