package oa;

import ka.a0;
import ka.a1;
import ka.b0;
import ka.c1;
import ka.d0;
import ka.d1;
import ka.e1;
import ka.f0;
import ka.f1;
import ka.g0;
import ka.g1;
import ka.h0;
import ka.h1;
import ka.i0;
import ka.i1;
import ka.j0;
import ka.j1;
import ka.k0;
import ka.l0;
import ka.m0;
import ka.n0;
import ka.o0;
import ka.p0;
import ka.q;
import ka.q0;
import ka.r;
import ka.r0;
import ka.s;
import ka.s0;
import ka.t;
import ka.u;
import ka.u0;
import ka.v0;
import ka.w;
import ka.w0;
import ka.x;
import ka.x0;
import ka.y;
import ka.z;
import ka.z0;
import kotlin.jvm.internal.e0;
import timber.log.Timber;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class n {
    public static final ka.f findTransition(ka.a from, ka.a to2) {
        e0.checkNotNullParameter(from, "from");
        e0.checkNotNullParameter(to2, "to");
        Timber.Forest forest = Timber.Forest;
        forest.tag("Akitude").d("findTransition from " + from + " to " + to2, new Object[0]);
        switch (from.ordinal()) {
            case 0:
                int iOrdinal = to2.ordinal();
                if (iOrdinal == 1) {
                    return ka.i.f70741b;
                }
                if (iOrdinal == 2) {
                    return ka.k.f70747b;
                }
                if (iOrdinal == 3) {
                    return ka.l.f70749b;
                }
                if (iOrdinal == 14) {
                    return ka.j.f70744b;
                }
                forest.tag("Akitude").d("transition not found from Concentration", new Object[0]);
                return null;
            case 1:
                int iOrdinal2 = to2.ordinal();
                if (iOrdinal2 == 6) {
                    return w.f70771b;
                }
                if (iOrdinal2 == 11) {
                    return y.f70775b;
                }
                if (iOrdinal2 == 22) {
                    return a0.f70695b;
                }
                if (iOrdinal2 == 8) {
                    return x.f70773b;
                }
                if (iOrdinal2 == 9) {
                    return z.f70777b;
                }
                forest.tag("Akitude").d("transition not found from Espoir", new Object[0]);
                return null;
            case 2:
                int iOrdinal3 = to2.ordinal();
                if (iOrdinal3 == 15) {
                    return z0.f70778b;
                }
                if (iOrdinal3 == 18) {
                    return a1.f70696b;
                }
                forest.tag("Akitude").d("transition not found from Serein1", new Object[0]);
                return null;
            case 3:
                int iOrdinal4 = to2.ordinal();
                if (iOrdinal4 == 15) {
                    return c1.f70709b;
                }
                if (iOrdinal4 == 18) {
                    return d1.f70714b;
                }
                forest.tag("Akitude").d("transition not found from Serein2", new Object[0]);
                return null;
            case 4:
            case 12:
            case 13:
            default:
                forest.tag("Akitude").d("akitude not found", new Object[0]);
                return null;
            case 5:
                int iOrdinal5 = to2.ordinal();
                if (iOrdinal5 == 7) {
                    return ka.n.f70753b;
                }
                if (iOrdinal5 == 8) {
                    return ka.o.f70755b;
                }
                if (iOrdinal5 == 9) {
                    return ka.p.f70757b;
                }
                if (iOrdinal5 == 18) {
                    return q.f70759b;
                }
                if (iOrdinal5 == 22) {
                    return r.f70761b;
                }
                forest.tag("Akitude").d("transition not found from Confiant", new Object[0]);
                return null;
            case 6:
                if (m.$EnumSwitchMapping$0[to2.ordinal()] == 7) {
                    return s.f70763b;
                }
                forest.tag("Akitude").d("transition not found from Deception", new Object[0]);
                return null;
            case 7:
                if (m.$EnumSwitchMapping$0[to2.ordinal()] == 11) {
                    return u.f70767b;
                }
                forest.tag("Akitude").d("transition not found from Espiegle", new Object[0]);
                return null;
            case 8:
                if (m.$EnumSwitchMapping$0[to2.ordinal()] == 14) {
                    return b0.f70699b;
                }
                forest.tag("Akitude").d("transition not found from Felicitation", new Object[0]);
                return null;
            case 9:
                if (m.$EnumSwitchMapping$0[to2.ordinal()] == 14) {
                    return x0.f70774b;
                }
                forest.tag("Akitude").d("transition not found from Reprimande", new Object[0]);
                return null;
            case 10:
                int iOrdinal6 = to2.ordinal();
                if (iOrdinal6 == 5) {
                    return u0.f70768b;
                }
                if (iOrdinal6 == 16) {
                    return v0.f70770b;
                }
                if (iOrdinal6 == 18) {
                    return w0.f70772b;
                }
                forest.tag("Akitude").d("transition not found from Mobile", new Object[0]);
                return null;
            case 11:
                int iOrdinal7 = to2.ordinal();
                if (iOrdinal7 == 0) {
                    return q0.f70760b;
                }
                if (iOrdinal7 == 16) {
                    return s0.f70764b;
                }
                if (iOrdinal7 == 17) {
                    return r0.f70762b;
                }
                forest.tag("Akitude").d("transition not found from Merci", new Object[0]);
                return null;
            case 14:
                int iOrdinal8 = to2.ordinal();
                if (iOrdinal8 == 15) {
                    return ka.e0.f70730b;
                }
                if (iOrdinal8 == 19) {
                    return f0.f70733b;
                }
                if (iOrdinal8 == 21) {
                    return d0.f70713b;
                }
                forest.tag("Akitude").d("transition not found from Inquiet", new Object[0]);
                return null;
            case 15:
                int iOrdinal9 = to2.ordinal();
                if (iOrdinal9 == 0) {
                    return g0.f70736b;
                }
                if (iOrdinal9 == 7) {
                    return i0.f70742b;
                }
                if (iOrdinal9 == 16) {
                    return j0.f70745b;
                }
                if (iOrdinal9 == 17) {
                    return h0.f70739b;
                }
                forest.tag("Akitude").d("transition not found from Inspiration forte", new Object[0]);
                return null;
            case 16:
                int iOrdinal10 = to2.ordinal();
                if (iOrdinal10 == 2) {
                    return l0.f70750b;
                }
                if (iOrdinal10 == 3) {
                    return m0.f70752b;
                }
                if (iOrdinal10 == 5) {
                    return k0.f70748b;
                }
                forest.tag("Akitude").d("transition not found from Inspiration legere", new Object[0]);
                return null;
            case 17:
                int iOrdinal11 = to2.ordinal();
                if (iOrdinal11 == 1) {
                    return ka.g.f70735b;
                }
                if (iOrdinal11 == 14) {
                    return ka.h.f70738b;
                }
                forest.tag("Akitude").d("transition not found from concentration intense", new Object[0]);
                return null;
            case 18:
                int iOrdinal12 = to2.ordinal();
                if (iOrdinal12 == 0) {
                    return e1.f70731b;
                }
                if (iOrdinal12 == 1) {
                    return g1.f70737b;
                }
                if (iOrdinal12 == 8) {
                    return h1.f70740b;
                }
                if (iOrdinal12 == 16) {
                    return i1.f70743b;
                }
                if (iOrdinal12 == 17) {
                    return f1.f70734b;
                }
                forest.tag("Akitude").d("transition not found from Surprise", new Object[0]);
                return null;
            case 19:
                if (m.$EnumSwitchMapping$0[to2.ordinal()] == 10) {
                    return n0.f70754b;
                }
                forest.tag("Akitude").d("transition not found from leger decouragement", new Object[0]);
                return null;
            case 20:
                int iOrdinal13 = to2.ordinal();
                if (iOrdinal13 == 1) {
                    return p0.f70758b;
                }
                if (iOrdinal13 == 5) {
                    return o0.f70756b;
                }
                forest.tag("Akitude").d("transition not found from lecture en bas", new Object[0]);
                return null;
            case 21:
                if (m.$EnumSwitchMapping$0[to2.ordinal()] == 10) {
                    return t.f70765b;
                }
                forest.tag("Akitude").d("transition not found from Decouragement", new Object[0]);
                return null;
            case 22:
                if (m.$EnumSwitchMapping$0[to2.ordinal()] == 21) {
                    return j1.f70746b;
                }
                forest.tag("Akitude").d("transition not found from Triomphe", new Object[0]);
                return null;
        }
    }
}
