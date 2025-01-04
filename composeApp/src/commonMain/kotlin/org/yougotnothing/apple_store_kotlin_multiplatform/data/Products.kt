package org.yougotnothing.apple_store_kotlin_multiplatform.data

import org.jetbrains.compose.resources.StringResource
import applestorekotlinmultiplatform.composeapp.generated.resources.Res
import applestorekotlinmultiplatform.composeapp.generated.resources.imac_m4
import applestorekotlinmultiplatform.composeapp.generated.resources.mac_mini_m4
import applestorekotlinmultiplatform.composeapp.generated.resources.mac_mini_m4_pro
import applestorekotlinmultiplatform.composeapp.generated.resources.mac_studio_m2
import applestorekotlinmultiplatform.composeapp.generated.resources.macbook_air_m2
import applestorekotlinmultiplatform.composeapp.generated.resources.macbook_air_m3
import applestorekotlinmultiplatform.composeapp.generated.resources.macbook_pro_m4
import applestorekotlinmultiplatform.composeapp.generated.resources.macbook_pro_m4_max
import applestorekotlinmultiplatform.composeapp.generated.resources.macbook_pro_m4_pro

enum class Products(val title: StringResource) {
    MacMiniM4(title = Res.string.mac_mini_m4),
    MacMiniM4Pro(title = Res.string.mac_mini_m4_pro),
    MacStudioM2(title = Res.string.mac_studio_m2),
    IMacM4(title = Res.string.imac_m4),
    MacBookAirM2(title = Res.string.macbook_air_m2),
    MacBookAirM3(title = Res.string.macbook_air_m3),
    MacBookProM4(title = Res.string.macbook_pro_m4),
    MacBookProM4Pro(title = Res.string.macbook_pro_m4_pro),
    MacBookProM4Max(title = Res.string.macbook_pro_m4_max)
}