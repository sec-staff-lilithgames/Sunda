package bf;

import com.google.android.exoplayer2.u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public interface c0 {
    f0 createMediaSource(u1 u1Var);

    int[] getSupportedTypes();

    c0 setDrmSessionManagerProvider(de.u uVar);

    c0 setLoadErrorHandlingPolicy(qf.o0 o0Var);

    default c0 setCmcdConfigurationFactory(qf.i iVar) {
        return this;
    }
}
