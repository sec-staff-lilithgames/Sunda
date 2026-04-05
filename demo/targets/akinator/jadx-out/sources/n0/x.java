package n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f75219a = new x();

    public final c0.n incomingAnimationSpecForInteraction(f0.n interaction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        if ((interaction instanceof f0.t) || (interaction instanceof f0.b) || (interaction instanceof f0.i) || (interaction instanceof f0.d)) {
            return y.f75234a;
        }
        return null;
    }

    public final c0.n outgoingAnimationSpecForInteraction(f0.n interaction) {
        kotlin.jvm.internal.e0.checkNotNullParameter(interaction, "interaction");
        if (!(interaction instanceof f0.t) && !(interaction instanceof f0.b)) {
            if (interaction instanceof f0.i) {
                return y.f75236c;
            }
            if (interaction instanceof f0.d) {
                return y.f75235b;
            }
            return null;
        }
        return y.f75235b;
    }
}
