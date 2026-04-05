package com.unity3d.services.ads.gmascar.utils;

import com.unity3d.ads.AdFormat;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.services.core.configuration.IExperiments;
import java.util.ArrayList;
import java.util.List;
import kl.e;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class ScarAdFormatProvider implements IScarAdFormatProvider {
    private final IExperiments experiments;
    private final TokenConfiguration tokenConfiguration;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdFormat.values().length];
            try {
                iArr[AdFormat.BANNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ScarAdFormatProvider(TokenConfiguration tokenConfiguration, IExperiments experiments) {
        e0.checkNotNullParameter(experiments, "experiments");
        this.tokenConfiguration = tokenConfiguration;
        this.experiments = experiments;
    }

    @Override // com.unity3d.services.ads.gmascar.utils.IScarAdFormatProvider
    public List<e> buildAdFormatList() {
        ArrayList arrayList = new ArrayList();
        TokenConfiguration tokenConfiguration = this.tokenConfiguration;
        e eVar = e.f71585f;
        if (tokenConfiguration == null) {
            arrayList.add(e.f71584e);
            arrayList.add(e.f71583c);
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(eVar);
                return arrayList;
            }
        } else {
            if (WhenMappings.$EnumSwitchMapping$0[tokenConfiguration.getAdFormat().ordinal()] != 1) {
                arrayList.add(AdFormatExtensions.toUnityAdFormat(this.tokenConfiguration.getAdFormat()));
                return arrayList;
            }
            if (this.experiments.isScarBannerHbEnabled()) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public final IExperiments getExperiments() {
        return this.experiments;
    }

    public final TokenConfiguration getTokenConfiguration() {
        return this.tokenConfiguration;
    }
}
