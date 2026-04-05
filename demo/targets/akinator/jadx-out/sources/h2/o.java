package h2;

import android.os.Build;
import android.text.StaticLayout;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class o implements s {
    @Override // h2.s
    public StaticLayout create(t tVar) {
        e0.checkNotNullParameter(tVar, SFPXhf.SaoeC);
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(tVar.getText(), tVar.getStart(), tVar.getEnd(), tVar.getPaint(), tVar.getWidth());
        builderObtain.setTextDirection(tVar.getTextDir());
        builderObtain.setAlignment(tVar.getAlignment());
        builderObtain.setMaxLines(tVar.getMaxLines());
        builderObtain.setEllipsize(tVar.getEllipsize());
        builderObtain.setEllipsizedWidth(tVar.getEllipsizedWidth());
        builderObtain.setLineSpacing(tVar.getLineSpacingExtra(), tVar.getLineSpacingMultiplier());
        builderObtain.setIncludePad(tVar.getIncludePadding());
        builderObtain.setBreakStrategy(tVar.getBreakStrategy());
        builderObtain.setHyphenationFrequency(tVar.getHyphenationFrequency());
        builderObtain.setIndents(tVar.getLeftIndents(), tVar.getRightIndents());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            e0.checkNotNullExpressionValue(builderObtain, "this");
            p.f58656a.setJustificationMode(builderObtain, tVar.getJustificationMode());
        }
        if (i10 >= 28) {
            e0.checkNotNullExpressionValue(builderObtain, "this");
            q.f58657a.setUseLineSpacingFromFallbacks(builderObtain, tVar.getUseFallbackLineSpacing());
        }
        StaticLayout staticLayoutBuild = builderObtain.build();
        e0.checkNotNullExpressionValue(staticLayoutBuild, "obtain(params.text, para…  }\n            }.build()");
        return staticLayoutBuild;
    }
}
