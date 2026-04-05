package io.bidmachine.protobuf.rendering;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.i5;
import com.explorestack.protobuf.i7;
import com.explorestack.protobuf.id;
import com.explorestack.protobuf.m5;
import com.unity3d.ads.core.domain.AndroidInitializeBoldSDK;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class RenderingProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n-bidmachine/protobuf/rendering/rendering.proto\u0012\u0013bidmachine.protobuf\u001a\u001egoogle/protobuf/wrappers.proto\"à\u0007\n\u0010RenderingFeature\u0012`\n\u0018broken_creative_detector\u0018\u0001 \u0001(\u000b2<.bidmachine.protobuf.RenderingFeature.BrokenCreativeDetectorH\u0000\u001aÞ\u0006\n\u0016BrokenCreativeDetector\u0012S\n\u0005event\u0018\u0001 \u0001(\u000b2B.bidmachine.protobuf.RenderingFeature.BrokenCreativeDetector.EventH\u0000\u0012c\n\rconfiguration\u0018\u0002 \u0001(\u000b2J.bidmachine.protobuf.RenderingFeature.BrokenCreativeDetector.ConfigurationH\u0000\u001a<\n\tAlgorithm\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006weight\u0018\u0002 \u0001(\u0001\u0012\u0011\n\tthreshold\u0018\u0003 \u0001(\u0001\u001a\u008e\u0001\n\u000fAlgorithmResult\u0012\u000e\n\u0006result\u0018\u0001 \u0001(\u0005\u0012\u0010\n\bduration\u0018\u0002 \u0001(\u0001\u0012Y\n\talgorithm\u0018\u0003 \u0001(\u000b2F.bidmachine.protobuf.RenderingFeature.BrokenCreativeDetector.Algorithm\u001aµ\u0001\n\u0005Event\u0012\r\n\u0005phase\u0018\u0001 \u0001(\u0005\u0012\u000e\n\u0006result\u0018\u0002 \u0001(\u0005\u0012\u0010\n\bduration\u0018\u0003 \u0001(\u0001\u0012\u0011\n\tcomponent\u0018\u0004 \u0001(\t\u0012h\n\u0012algorithms_results\u0018\u0005 \u0003(\u000b2L.bidmachine.protobuf.RenderingFeature.BrokenCreativeDetector.AlgorithmResult\u001añ\u0001\n\rConfiguration\u0012\u000f\n\u0007timeout\u0018\u0001 \u0001(\u0001\u0012\u0018\n\u0010downscale_factor\u0018\u0002 \u0001(\u0001\u0012\u0012\n\nerror_only\u0018\u0003 \u0001(\b\u0012\u0017\n\u000fallow_duplicate\u0018\u0004 \u0001(\b\u0012\u0012\n\nstop_after\u0018\u0005 \u0001(\t\u0012\u0018\n\u0010weight_threshold\u0018\u0006 \u0001(\u0001\u0012Z\n\nalgorithms\u0018\u0007 \u0003(\u000b2F.bidmachine.protobuf.RenderingFeature.BrokenCreativeDetector.AlgorithmB\u000f\n\rpayload_oneofB\t\n\u0007feature\"ú<\n\tRendering\u0012?\n\u000borientation\u0018\u0001 \u0001(\u000e2*.bidmachine.protobuf.Rendering.Orientation\u0012<\n\ncache_type\u0018\u0002 \u0001(\u000e2(.bidmachine.protobuf.Rendering.CacheType\u00124\n\u0006phases\u0018\u0003 \u0003(\u000b2$.bidmachine.protobuf.Rendering.Phase\u0012G\n\rcustom_params\u0018\u0004 \u0003(\u000b20.bidmachine.protobuf.Rendering.CustomParamsEntry\u0012J\n\rsk_ad_network\u0018\u0005 \u0001(\u000b23.bidmachine.protobuf.Rendering.SKStoreConfiguration\u0012R\n\u0015product_configuration\u0018\u0006 \u0001(\u000b23.bidmachine.protobuf.Rendering.ProductConfiguration\u00127\n\bfeatures\u0018\u0007 \u0003(\u000b2%.bidmachine.protobuf.RenderingFeature\u0012=\n\nbackground\u0018\b \u0001(\u000b2).bidmachine.protobuf.Rendering.Background\u001a§\u0001\n\u0005Color\u0012\u000f\n\u0005color\u0018\u0001 \u0001(\tH\u0000\u0012A\n\bgradient\u0018\u0002 \u0001(\u000b2-.bidmachine.protobuf.Rendering.Color.GradientH\u0000\u001a;\n\bGradient\u0012\f\n\u0004type\u0018\u0001 \u0001(\t\u0012\u0011\n\tdirection\u0018\u0002 \u0001(\t\u0012\u000e\n\u0006colors\u0018\u0003 \u0003(\tB\r\n\u000bsource_onof\u001aÍ\u0001\n\bResource\u0012\u0011\n\u0007unknown\u0018\u0001 \u0001(\tH\u0000\u0012\r\n\u0003url\u0018\u0002 \u0001(\tH\u0000\u0012\u0010\n\u0006base64\u0018\u0003 \u0001(\tH\u0000\u0012B\n\u0007payload\u0018\u0004 \u0001(\u000b2/.bidmachine.protobuf.Rendering.Resource.PayloadH\u0000\u001a9\n\u0007Payload\u0012\r\n\u0003xml\u0018\u0001 \u0001(\tH\u0000\u0012\u000e\n\u0004html\u0018\u0002 \u0001(\tH\u0000B\u000f\n\rpayload_oneofB\u000e\n\fsource_oneof\u001aò\u0001\n\u0005Image\u0012=\n\u0005scale\u0018\u0001 \u0001(\u000e2..bidmachine.protobuf.Rendering.Image.ScaleType\u00129\n\bresource\u0018\u0002 \u0001(\u000b2'.bidmachine.protobuf.Rendering.Resource\"o\n\tScaleType\u0012\u0013\n\u000fSCALE_TYPE_NONE\u0010\u0000\u0012\u0016\n\u0012SCALE_TYPE_TO_FILL\u0010\u0001\u0012\u001a\n\u0016SCALE_TYPE_ASPECT_FILL\u0010\u0002\u0012\u0019\n\u0015SCALE_TYPE_ASPECT_FIT\u0010\u0003\u001a\u009b\u0001\n\u000bPlaceholder\u0012\u000e\n\u0004name\u0018\u0001 \u0001(\tH\u0000\u00125\n\u0005color\u0018\u0002 \u0001(\u000b2$.bidmachine.protobuf.Rendering.ColorH\u0000\u00125\n\u0005image\u0018\u0003 \u0001(\u000b2$.bidmachine.protobuf.Rendering.ImageH\u0000B\u000e\n\fsource_oneof\u001aÜ\u0001\n\nBackground\u0012\u000f\n\u0007opacity\u0018\u0001 \u0001(\u0001\u00125\n\u0005color\u0018\u0002 \u0001(\u000b2$.bidmachine.protobuf.Rendering.ColorH\u0000\u00125\n\u0005image\u0018\u0003 \u0001(\u000b2$.bidmachine.protobuf.Rendering.ImageH\u0000\u0012?\n\u000bplaceholder\u0018\u0004 \u0001(\u000b2*.bidmachine.protobuf.Rendering.PlaceholderB\u000e\n\fsource_oneof\u001a¬\u0004\n\u0011AdaptiveAnimation\u0012\r\n\u0005event\u0018\u0001 \u0001(\t\u0012E\n\u0005style\u0018\u0002 \u0001(\u000b26.bidmachine.protobuf.Rendering.AdaptiveAnimation.Style\u001a,\n\u0006Timing\u0012\u0010\n\bduration\u0018\u0001 \u0001(\u0001\u0012\u0010\n\bfunction\u0018\u0002 \u0001(\t\u001a^\n\u0013FadeAnimationOption\u0012G\n\u0006timing\u0018\u0001 \u0001(\u000b27.bidmachine.protobuf.Rendering.AdaptiveAnimation.Timing\u001ar\n\u0014SlideAnimationOption\u0012\u0011\n\tdirection\u0018\u0001 \u0001(\t\u0012G\n\u0006timing\u0018\u0002 \u0001(\u000b27.bidmachine.protobuf.Rendering.AdaptiveAnimation.Timing\u001a¾\u0001\n\u0005Style\u0012T\n\u0004fade\u0018\u0001 \u0001(\u000b2D.bidmachine.protobuf.Rendering.AdaptiveAnimation.FadeAnimationOptionH\u0000\u0012V\n\u0005slide\u0018\u0002 \u0001(\u000b2E.bidmachine.protobuf.Rendering.AdaptiveAnimation.SlideAnimationOptionH\u0000B\u0007\n\u0005style\u001a\u008c\"\n\u0005Phase\u0012\u0010\n\bsequence\u0018\u0001 \u0001(\u0005\u0012\u001c\n\u0010background_color\u0018\u0002 \u0001(\tB\u0002\u0018\u0001\u0012?\n\u0003ads\u0018\u0003 \u0003(\u000b22.bidmachine.protobuf.Rendering.Phase.ViewComponent\u0012D\n\bcontrols\u0018\u0004 \u0003(\u000b22.bidmachine.protobuf.Rendering.Phase.ViewComponent\u0012E\n\u0007methods\u0018\u0005 \u0003(\u000b24.bidmachine.protobuf.Rendering.Phase.MethodComponent\u0012:\n\u0006events\u0018\u0006 \u0003(\u000b2*.bidmachine.protobuf.Rendering.Phase.Event\u0012M\n\rcustom_params\u0018\u0007 \u0003(\u000b26.bidmachine.protobuf.Rendering.Phase.CustomParamsEntry\u0012D\n\nanimations\u0018\b \u0003(\u000b20.bidmachine.protobuf.Rendering.AdaptiveAnimation\u00127\n\bfeatures\u0018\t \u0003(\u000b2%.bidmachine.protobuf.RenderingFeature\u0012\u0014\n\fstate_groups\u0018\n \u0003(\t\u0012=\n\nbackground\u0018\u000b \u0001(\u000b2).bidmachine.protobuf.Rendering.Background\u001a\u0096\u0012\n\rViewComponent\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012R\n\u0004type\u0018\u0002 \u0001(\u000e2D.bidmachine.protobuf.Rendering.Phase.ViewComponent.ViewComponentType\u0012\u0012\n\u0006source\u0018\u0003 \u0001(\tB\u0002\u0018\u0001\u0012\u0013\n\u000bplaceholder\u0018\u0004 \u0001(\t\u0012[\n\rcustom_params\u0018\u0005 \u0003(\u000b2D.bidmachine.protobuf.Rendering.Phase.ViewComponent.CustomParamsEntry\u0012I\n\u0006layout\u0018\u0006 \u0001(\u000b29.bidmachine.protobuf.Rendering.Phase.ViewComponent.Layout\u0012Q\n\nappearance\u0018\u0007 \u0001(\u000b2=.bidmachine.protobuf.Rendering.Phase.ViewComponent.Appearance\u0012N\n\tmeasurers\u0018\b \u0003(\u000b2;.bidmachine.protobuf.Rendering.Phase.ViewComponent.Measurer\u00127\n\bfeatures\u0018\t \u0003(\u000b2%.bidmachine.protobuf.RenderingFeature\u00129\n\bresource\u0018\n \u0001(\u000b2'.bidmachine.protobuf.Rendering.Resource\u0012\f\n\u0004text\u0018\u000b \u0001(\t\u001a3\n\u0011CustomParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a¡\u0004\n\u0006Layout\u0012Y\n\u000bconstraints\u0018\u0001 \u0003(\u000b2D.bidmachine.protobuf.Rendering.Phase.ViewComponent.Layout.Constraint\u001a»\u0003\n\nConstraint\u0012b\n\rsource_anchor\u0018\u0001 \u0001(\u000e2K.bidmachine.protobuf.Rendering.Phase.ViewComponent.Layout.Constraint.Anchor\u0012b\n\rtarget_anchor\u0018\u0002 \u0001(\u000e2K.bidmachine.protobuf.Rendering.Phase.ViewComponent.Layout.Constraint.Anchor\u0012\u000e\n\u0006target\u0018\u0003 \u0001(\t\u0012\r\n\u0005value\u0018\u0004 \u0001(\u0001\u0012\u0012\n\nmultiplier\u0018\u0005 \u0001(\u0001\"±\u0001\n\u0006Anchor\u0012\u0012\n\u000eANCHOR_INVALID\u0010\u0000\u0012\u000f\n\u000bANCHOR_LEFT\u0010\u0001\u0012\u0010\n\fANCHOR_RIGHT\u0010\u0002\u0012\u000e\n\nANCHOR_TOP\u0010\u0003\u0012\u0011\n\rANCHOR_BOTTOM\u0010\u0004\u0012\u0013\n\u000fANCHOR_CENTER_X\u0010\u0005\u0012\u0013\n\u000fANCHOR_CENTER_Y\u0010\u0006\u0012\u0010\n\fANCHOR_WIDTH\u0010\u0007\u0012\u0011\n\rANCHOR_HEIGHT\u0010\b\u001aì\u0003\n\nAppearance\u0012\u0012\n\nfont_style\u0018\u0001 \u0001(\t\u0012\u000f\n\u0007visible\u0018\u0002 \u0001(\b\u0012\u000f\n\u0007opacity\u0018\u0003 \u0001(\u0001\u0012\u0010\n\boutlined\u0018\u0004 \u0001(\b\u0012\u0014\n\fstroke_width\u0018\u0005 \u0001(\u0001\u0012\u0014\n\fstroke_color\u0018\u0006 \u0001(\t\u0012\u0014\n\fshadow_color\u0018\u0007 \u0001(\t\u0012\u001c\n\u0010background_color\u0018\b \u0001(\tB\u0002\u0018\u0001\u0012\u0011\n\tclickable\u0018\t \u0001(\b\u0012\u000f\n\u0007padding\u0018\n \u0001(\t\u0012\u0011\n\tfont_size\u0018\u000b \u0001(\u0001\u0012\u0016\n\u000etext_alignment\u0018\f \u0001(\t\u0012\u0019\n\u0011text_line_spacing\u0018\r \u0001(\u0001\u0012\u001c\n\u0014text_number_of_lines\u0018\u000e \u0001(\u0005\u0012\u0015\n\rcorner_radius\u0018\u000f \u0001(\u0001\u0012D\n\nanimations\u0018\u0010 \u0003(\u000b20.bidmachine.protobuf.Rendering.AdaptiveAnimation\u0012=\n\nbackground\u0018\u0011 \u0001(\u000b2).bidmachine.protobuf.Rendering.Background\u0012\u0012\n\nfill_color\u0018\u0012 \u0001(\t\u001a¬\u0001\n\bMeasurer\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u0012_\n\nparameters\u0018\u0002 \u0003(\u000b2K.bidmachine.protobuf.Rendering.Phase.ViewComponent.Measurer.ParametersEntry\u001a1\n\u000fParametersEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\"µ\u0003\n\u0011ViewComponentType\u0012\u001f\n\u001bVIEW_COMPONENT_TYPE_INVALID\u0010\u0000\u0012\u001d\n\u0019VIEW_COMPONENT_TYPE_VIDEO\u0010\u0001\u0012\u001d\n\u0019VIEW_COMPONENT_TYPE_MRAID\u0010\u0002\u0012\u001d\n\u0019VIEW_COMPONENT_TYPE_IMAGE\u0010\u0003\u0012!\n\u001dVIEW_COMPONENT_TYPE_COUNTDOWN\u0010\u0004\u0012 \n\u001cVIEW_COMPONENT_TYPE_PROGRESS\u0010\u0005\u0012&\n\"VIEW_COMPONENT_TYPE_COUNTDOWN_TEXT\u0010\u0006\u0012\u001c\n\u0018VIEW_COMPONENT_TYPE_MUTE\u0010\u0007\u0012\u001e\n\u001aVIEW_COMPONENT_TYPE_UNMUTE\u0010\b\u0012\u001d\n\u0019VIEW_COMPONENT_TYPE_CROSS\u0010\t\u0012\u001c\n\u0018VIEW_COMPONENT_TYPE_SKIP\u0010\n\u0012\u001b\n\u0017VIEW_COMPONENT_TYPE_CTA\u0010\u000b\u0012\u001d\n\u0019VIEW_COMPONENT_TYPE_LABEL\u0010\f\u001a\u001f\n\u000fMethodComponent\u0012\f\n\u0004name\u0018\u0001 \u0001(\t\u001a¶\n\n\u0005Event\u0012B\n\u0004name\u0018\u0001 \u0001(\u000e24.bidmachine.protobuf.Rendering.Phase.Event.EventName\u0012\u000e\n\u0006source\u0018\u0002 \u0001(\t\u0012>\n\u0005tasks\u0018\u0003 \u0003(\u000b2/.bidmachine.protobuf.Rendering.Phase.Event.Task\u001a\u0097\u0005\n\u0004Task\u0012F\n\u0004name\u0018\u0001 \u0001(\u000e28.bidmachine.protobuf.Rendering.Phase.Event.Task.TaskName\u0012\u000e\n\u0006target\u0018\u0002 \u0001(\t\u0012\r\n\u0005value\u0018\u0003 \u0001(\t\u0012\u0014\n\fstate_groups\u0018\u0004 \u0003(\t\"\u0091\u0004\n\bTaskName\u0012\u0015\n\u0011TASK_NAME_INVALID\u0010\u0000\u0012\u0013\n\u000fTASK_NAME_START\u0010\u0001\u0012\u0012\n\u000eTASK_NAME_MUTE\u0010\u0002\u0012\u0014\n\u0010TASK_NAME_UNMUTE\u0010\u0003\u0012\u0013\n\u000fTASK_NAME_TRACK\u0010\u0004\u0012\u0013\n\u000fTASK_NAME_CLOSE\u0010\u0005\u0012\u0012\n\u000eTASK_NAME_SKIP\u0010\u0006\u0012\u0012\n\u000eTASK_NAME_OPEN\u0010\u0007\u0012\u0012\n\u000eTASK_NAME_SHOW\u0010\b\u0012\u0012\n\u000eTASK_NAME_HIDE\u0010\t\u0012\u0016\n\u0012TASK_NAME_PROGRESS\u0010\n\u0012\u0016\n\u0012TASK_NAME_SCHEDULE\u0010\u000b\u0012\u001d\n\u0019TASK_NAME_LOCK_VISIBILITY\u0010\f\u0012\u001f\n\u001bTASK_NAME_UNLOCK_VISIBILITY\u0010\r\u0012\u001a\n\u0016TASK_NAME_SHOW_OVERLAY\u0010\u000e\u0012\u001a\n\u0016TASK_NAME_HIDE_OVERLAY\u0010\u000f\u0012\u0019\n\u0015TASK_NAME_NOTIFY_OPEN\u0010\u0010\u0012\u001c\n\u0018TASK_NAME_SIMULATE_CLICK\u0010\u0011\u0012\u001b\n\u0017TASK_NAME_PRIVACY_SHEET\u0010\u0012\u0012\u0014\n\u0010TASK_NAME_REPEAT\u0010\u0013\u0012!\n\u001dTASK_NAME_TOGGLE_STATE_GROUPS\u0010\u0014\"þ\u0003\n\tEventName\u0012\u0016\n\u0012EVENT_NAME_INVALID\u0010\u0000\u0012\u001c\n\u0018EVENT_NAME_ON_IMPRESSION\u0010\u0001\u0012\u0017\n\u0013EVENT_NAME_ON_CLICK\u0010\u0002\u0012\u001a\n\u0016EVENT_NAME_ON_PROGRESS\u0010\u0003\u0012\u001a\n\u0016EVENT_NAME_ON_NAVIGATE\u0010\u0004\u0012\u0016\n\u0012EVENT_NAME_ON_MUTE\u0010\u0005\u0012\u0018\n\u0014EVENT_NAME_ON_UNMUTE\u0010\u0006\u0012\u0017\n\u0013EVENT_NAME_ON_PAUSE\u0010\u0007\u0012\u0018\n\u0014EVENT_NAME_ON_RESUME\u0010\b\u0012\u0016\n\u0012EVENT_NAME_ON_SKIP\u0010\t\u0012\u0017\n\u0013EVENT_NAME_ON_CLOSE\u0010\n\u0012\u0017\n\u0013EVENT_NAME_ON_START\u0010\u000b\u0012 \n\u001cEVENT_NAME_ON_FIRST_QUARTILE\u0010\f\u0012\u001a\n\u0016EVENT_NAME_ON_MIDPOINT\u0010\r\u0012 \n\u001cEVENT_NAME_ON_THIRD_QUARTILE\u0010\u000e\u0012\u001a\n\u0016EVENT_NAME_ON_COMPLETE\u0010\u000f\u0012\"\n\u001eEVENT_NAME_ON_USE_CUSTOM_CLOSE\u0010\u0010\u0012\u001b\n\u0017EVENT_NAME_ON_SCHEDULED\u0010\u0011\u001a3\n\u0011CustomParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001a3\n\u0011CustomParamsEntry\u0012\u000b\n\u0003key\u0018\u0001 \u0001(\t\u0012\r\n\u0005value\u0018\u0002 \u0001(\t:\u00028\u0001\u001aí\u0006\n\u0014SKStoreConfiguration\u0012-\n\u0007version\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012:\n\u0014adnetwork_identifier\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00127\n\u0011source_identifier\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012;\n\u0015adcampaign_identifier\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012I\n#advertised_appstore_item_identifier\u0018\u0005 \u0001(\u000b2\u001c.google.protobuf.StringValue\u00125\n\u000fproduct_page_id\u0018\u0006 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012P\n\nfidelities\u0018\u0007 \u0003(\u000b2<.bidmachine.protobuf.Rendering.SKStoreConfiguration.Fidelity\u0012+\n\u0005nonce\u0018\b \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012E\n\u001fsource_appstore_item_identifier\u0018\t \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012/\n\ttimestamp\u0018\n \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012/\n\tsignature\u0018\u000b \u0001(\u000b2\u001c.google.protobuf.StringValue\u001aÉ\u0001\n\bFidelity\u0012.\n\bfidelity\u0018\u0001 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012/\n\tsignature\u0018\u0002 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012+\n\u0005nonce\u0018\u0003 \u0001(\u000b2\u001c.google.protobuf.StringValue\u0012/\n\ttimestamp\u0018\u0004 \u0001(\u000b2\u001c.google.protobuf.StringValue\u001a\u009a\u0001\n\u0014ProductConfiguration\u0012;\n\u0017allow_storekit_subclass\u0018\u0001 \u0001(\u000b2\u001a.google.protobuf.BoolValue\u0012E\n!should_remove_store_after_present\u0018\u0002 \u0001(\u000b2\u001a.google.protobuf.BoolValue\"s\n\u000bOrientation\u0012\u0017\n\u0013ORIENTATION_INVALID\u0010\u0000\u0012\u0018\n\u0014ORIENTATION_PORTRAIT\u0010\u0001\u0012\u0019\n\u0015ORIENTATION_LANDSCAPE\u0010\u0002\u0012\u0016\n\u0012ORIENTATION_SYSTEM\u0010\u0003\"v\n\tCacheType\u0012\u0016\n\u0012CACHE_TYPE_INVALID\u0010\u0000\u0012\u0018\n\u0014CACHE_TYPE_FULL_LOAD\u0010\u0001\u0012\u001b\n\u0017CACHE_TYPE_PARTIAL_LOAD\u0010\u0002\u0012\u001a\n\u0016CACHE_TYPE_STREAM_LOAD\u0010\u0003B:\n io.bidmachine.protobuf.renderingB\u000eRenderingProtoP\u0001¢\u0002\u0003BDMb\u0006proto3"}, new Descriptors.FileDescriptor[]{id.getDescriptor()});
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_RenderingFeature_descriptor;
    static final i7 internal_static_bidmachine_protobuf_RenderingFeature_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_FadeAnimationOption_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_FadeAnimationOption_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_SlideAnimationOption_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_SlideAnimationOption_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_Style_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_Style_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_Timing_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_Timing_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Background_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Background_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Color_Gradient_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Color_Gradient_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Color_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Color_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_CustomParamsEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_CustomParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Image_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Image_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_CustomParamsEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_CustomParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_Event_Task_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_Event_Task_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_Event_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_Event_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_MethodComponent_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_MethodComponent_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Appearance_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Appearance_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_CustomParamsEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_CustomParamsEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Layout_Constraint_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Layout_Constraint_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Layout_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Layout_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Measurer_ParametersEntry_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Measurer_ParametersEntry_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Measurer_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Measurer_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Phase_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Phase_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Placeholder_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Placeholder_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_ProductConfiguration_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_ProductConfiguration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Resource_Payload_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Resource_Payload_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_Resource_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_Resource_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_SKStoreConfiguration_Fidelity_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_SKStoreConfiguration_Fidelity_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_SKStoreConfiguration_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_SKStoreConfiguration_fieldAccessorTable;
    static final Descriptors.Descriptor internal_static_bidmachine_protobuf_Rendering_descriptor;
    static final i7 internal_static_bidmachine_protobuf_Rendering_fieldAccessorTable;

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_bidmachine_protobuf_RenderingFeature_descriptor = descriptor2;
        internal_static_bidmachine_protobuf_RenderingFeature_fieldAccessorTable = new i7(descriptor2, new String[]{"BrokenCreativeDetector", "Feature"});
        Descriptors.Descriptor descriptor3 = descriptor2.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_descriptor = descriptor3;
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_fieldAccessorTable = new i7(descriptor3, new String[]{"Event", "Configuration", "PayloadOneof"});
        Descriptors.Descriptor descriptor4 = descriptor3.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_descriptor = descriptor4;
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Algorithm_fieldAccessorTable = new i7(descriptor4, new String[]{"Name", "Weight", "Threshold"});
        Descriptors.Descriptor descriptor5 = descriptor3.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_descriptor = descriptor5;
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_AlgorithmResult_fieldAccessorTable = new i7(descriptor5, new String[]{"Result", "Duration", "Algorithm"});
        Descriptors.Descriptor descriptor6 = descriptor3.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_descriptor = descriptor6;
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Event_fieldAccessorTable = new i7(descriptor6, new String[]{"Phase", "Result", "Duration", "Component", "AlgorithmsResults"});
        Descriptors.Descriptor descriptor7 = descriptor3.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_descriptor = descriptor7;
        internal_static_bidmachine_protobuf_RenderingFeature_BrokenCreativeDetector_Configuration_fieldAccessorTable = new i7(descriptor7, new String[]{AndroidInitializeBoldSDK.MSG_TIMEOUT, "DownscaleFactor", "ErrorOnly", "AllowDuplicate", "StopAfter", "WeightThreshold", "Algorithms"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(1);
        internal_static_bidmachine_protobuf_Rendering_descriptor = descriptor8;
        internal_static_bidmachine_protobuf_Rendering_fieldAccessorTable = new i7(descriptor8, new String[]{"Orientation", "CacheType", "Phases", "CustomParams", "SkAdNetwork", "ProductConfiguration", "Features", "Background"});
        Descriptors.Descriptor descriptor9 = descriptor8.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_Color_descriptor = descriptor9;
        internal_static_bidmachine_protobuf_Rendering_Color_fieldAccessorTable = new i7(descriptor9, new String[]{"Color", "Gradient", "SourceOnof"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_Color_Gradient_descriptor = descriptor10;
        internal_static_bidmachine_protobuf_Rendering_Color_Gradient_fieldAccessorTable = new i7(descriptor10, new String[]{"Type", "Direction", "Colors"});
        Descriptors.Descriptor descriptor11 = descriptor8.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_Rendering_Resource_descriptor = descriptor11;
        internal_static_bidmachine_protobuf_Rendering_Resource_fieldAccessorTable = new i7(descriptor11, new String[]{"Unknown", "Url", "Base64", "Payload", "SourceOneof"});
        Descriptors.Descriptor descriptor12 = descriptor11.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_Resource_Payload_descriptor = descriptor12;
        internal_static_bidmachine_protobuf_Rendering_Resource_Payload_fieldAccessorTable = new i7(descriptor12, new String[]{"Xml", "Html", "PayloadOneof"});
        Descriptors.Descriptor descriptor13 = descriptor8.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_Rendering_Image_descriptor = descriptor13;
        internal_static_bidmachine_protobuf_Rendering_Image_fieldAccessorTable = new i7(descriptor13, new String[]{"Scale", "Resource"});
        Descriptors.Descriptor descriptor14 = descriptor8.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_Rendering_Placeholder_descriptor = descriptor14;
        internal_static_bidmachine_protobuf_Rendering_Placeholder_fieldAccessorTable = new i7(descriptor14, new String[]{"Name", "Color", "Image", "SourceOneof"});
        Descriptors.Descriptor descriptor15 = descriptor8.getNestedTypes().get(4);
        internal_static_bidmachine_protobuf_Rendering_Background_descriptor = descriptor15;
        internal_static_bidmachine_protobuf_Rendering_Background_fieldAccessorTable = new i7(descriptor15, new String[]{"Opacity", "Color", "Image", "Placeholder", "SourceOneof"});
        Descriptors.Descriptor descriptor16 = descriptor8.getNestedTypes().get(5);
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_descriptor = descriptor16;
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_fieldAccessorTable = new i7(descriptor16, new String[]{"Event", "Style"});
        Descriptors.Descriptor descriptor17 = descriptor16.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_Timing_descriptor = descriptor17;
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_Timing_fieldAccessorTable = new i7(descriptor17, new String[]{"Duration", "Function"});
        Descriptors.Descriptor descriptor18 = descriptor16.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_FadeAnimationOption_descriptor = descriptor18;
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_FadeAnimationOption_fieldAccessorTable = new i7(descriptor18, new String[]{"Timing"});
        Descriptors.Descriptor descriptor19 = descriptor16.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_SlideAnimationOption_descriptor = descriptor19;
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_SlideAnimationOption_fieldAccessorTable = new i7(descriptor19, new String[]{"Direction", "Timing"});
        Descriptors.Descriptor descriptor20 = descriptor16.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_Style_descriptor = descriptor20;
        internal_static_bidmachine_protobuf_Rendering_AdaptiveAnimation_Style_fieldAccessorTable = new i7(descriptor20, new String[]{"Fade", "Slide", "Style"});
        Descriptors.Descriptor descriptor21 = descriptor8.getNestedTypes().get(6);
        internal_static_bidmachine_protobuf_Rendering_Phase_descriptor = descriptor21;
        internal_static_bidmachine_protobuf_Rendering_Phase_fieldAccessorTable = new i7(descriptor21, new String[]{"Sequence", "BackgroundColor", "Ads", "Controls", "Methods", "Events", "CustomParams", "Animations", "Features", "StateGroups", "Background"});
        Descriptors.Descriptor descriptor22 = descriptor21.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_descriptor = descriptor22;
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_fieldAccessorTable = new i7(descriptor22, new String[]{"Name", "Type", "Source", "Placeholder", "CustomParams", "Layout", "Appearance", "Measurers", "Features", "Resource", "Text"});
        Descriptors.Descriptor descriptor23 = descriptor22.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_CustomParamsEntry_descriptor = descriptor23;
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_CustomParamsEntry_fieldAccessorTable = new i7(descriptor23, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor24 = descriptor22.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Layout_descriptor = descriptor24;
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Layout_fieldAccessorTable = new i7(descriptor24, new String[]{"Constraints"});
        Descriptors.Descriptor descriptor25 = descriptor24.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Layout_Constraint_descriptor = descriptor25;
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Layout_Constraint_fieldAccessorTable = new i7(descriptor25, new String[]{"SourceAnchor", "TargetAnchor", "Target", "Value", "Multiplier"});
        Descriptors.Descriptor descriptor26 = descriptor22.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Appearance_descriptor = descriptor26;
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Appearance_fieldAccessorTable = new i7(descriptor26, new String[]{"FontStyle", "Visible", "Opacity", "Outlined", "StrokeWidth", "StrokeColor", "ShadowColor", "BackgroundColor", "Clickable", "Padding", "FontSize", "TextAlignment", "TextLineSpacing", "TextNumberOfLines", "CornerRadius", "Animations", "Background", "FillColor"});
        Descriptors.Descriptor descriptor27 = descriptor22.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Measurer_descriptor = descriptor27;
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Measurer_fieldAccessorTable = new i7(descriptor27, new String[]{"Name", "Parameters"});
        Descriptors.Descriptor descriptor28 = descriptor27.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Measurer_ParametersEntry_descriptor = descriptor28;
        internal_static_bidmachine_protobuf_Rendering_Phase_ViewComponent_Measurer_ParametersEntry_fieldAccessorTable = new i7(descriptor28, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor29 = descriptor21.getNestedTypes().get(1);
        internal_static_bidmachine_protobuf_Rendering_Phase_MethodComponent_descriptor = descriptor29;
        internal_static_bidmachine_protobuf_Rendering_Phase_MethodComponent_fieldAccessorTable = new i7(descriptor29, new String[]{"Name"});
        Descriptors.Descriptor descriptor30 = descriptor21.getNestedTypes().get(2);
        internal_static_bidmachine_protobuf_Rendering_Phase_Event_descriptor = descriptor30;
        internal_static_bidmachine_protobuf_Rendering_Phase_Event_fieldAccessorTable = new i7(descriptor30, new String[]{"Name", "Source", "Tasks"});
        Descriptors.Descriptor descriptor31 = descriptor30.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_Phase_Event_Task_descriptor = descriptor31;
        internal_static_bidmachine_protobuf_Rendering_Phase_Event_Task_fieldAccessorTable = new i7(descriptor31, new String[]{"Name", "Target", "Value", "StateGroups"});
        Descriptors.Descriptor descriptor32 = descriptor21.getNestedTypes().get(3);
        internal_static_bidmachine_protobuf_Rendering_Phase_CustomParamsEntry_descriptor = descriptor32;
        internal_static_bidmachine_protobuf_Rendering_Phase_CustomParamsEntry_fieldAccessorTable = new i7(descriptor32, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor33 = descriptor8.getNestedTypes().get(7);
        internal_static_bidmachine_protobuf_Rendering_CustomParamsEntry_descriptor = descriptor33;
        internal_static_bidmachine_protobuf_Rendering_CustomParamsEntry_fieldAccessorTable = new i7(descriptor33, new String[]{"Key", "Value"});
        Descriptors.Descriptor descriptor34 = descriptor8.getNestedTypes().get(8);
        internal_static_bidmachine_protobuf_Rendering_SKStoreConfiguration_descriptor = descriptor34;
        internal_static_bidmachine_protobuf_Rendering_SKStoreConfiguration_fieldAccessorTable = new i7(descriptor34, new String[]{"Version", "AdnetworkIdentifier", "SourceIdentifier", "AdcampaignIdentifier", "AdvertisedAppstoreItemIdentifier", "ProductPageId", "Fidelities", "Nonce", "SourceAppstoreItemIdentifier", "Timestamp", "Signature"});
        Descriptors.Descriptor descriptor35 = descriptor34.getNestedTypes().get(0);
        internal_static_bidmachine_protobuf_Rendering_SKStoreConfiguration_Fidelity_descriptor = descriptor35;
        internal_static_bidmachine_protobuf_Rendering_SKStoreConfiguration_Fidelity_fieldAccessorTable = new i7(descriptor35, new String[]{"Fidelity", "Signature", "Nonce", "Timestamp"});
        Descriptors.Descriptor descriptor36 = descriptor8.getNestedTypes().get(9);
        internal_static_bidmachine_protobuf_Rendering_ProductConfiguration_descriptor = descriptor36;
        internal_static_bidmachine_protobuf_Rendering_ProductConfiguration_fieldAccessorTable = new i7(descriptor36, new String[]{"AllowStorekitSubclass", "ShouldRemoveStoreAfterPresent"});
        id.getDescriptor();
    }

    private RenderingProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(m5 m5Var) {
    }

    public static void registerAllExtensions(i5 i5Var) {
        registerAllExtensions((m5) i5Var);
    }
}
