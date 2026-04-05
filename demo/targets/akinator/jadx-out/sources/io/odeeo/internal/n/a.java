package io.odeeo.internal.n;

import bp.oM.DwaEpyvxz;
import io.odeeo.internal.q0.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f64739a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: io.odeeo.internal.n.a$a, reason: collision with other inner class name */
    public static final class C0622a extends a {

        /* renamed from: b, reason: collision with root package name */
        public final long f64740b;

        /* renamed from: c, reason: collision with root package name */
        public final List<b> f64741c;

        /* renamed from: d, reason: collision with root package name */
        public final List<C0622a> f64742d;

        public C0622a(int i10, long j10) {
            super(i10);
            this.f64740b = j10;
            this.f64741c = new ArrayList();
            this.f64742d = new ArrayList();
        }

        public void add(b bVar) {
            this.f64741c.add(bVar);
        }

        public int getChildAtomOfTypeCount(int i10) {
            int size = this.f64741c.size();
            int i11 = 0;
            for (int i12 = 0; i12 < size; i12++) {
                if (this.f64741c.get(i12).f64739a == i10) {
                    i11++;
                }
            }
            int size2 = this.f64742d.size();
            for (int i13 = 0; i13 < size2; i13++) {
                if (this.f64742d.get(i13).f64739a == i10) {
                    i11++;
                }
            }
            return i11;
        }

        public C0622a getContainerAtomOfType(int i10) {
            int size = this.f64742d.size();
            for (int i11 = 0; i11 < size; i11++) {
                C0622a c0622a = this.f64742d.get(i11);
                if (c0622a.f64739a == i10) {
                    return c0622a;
                }
            }
            return null;
        }

        public b getLeafAtomOfType(int i10) {
            int size = this.f64741c.size();
            for (int i11 = 0; i11 < size; i11++) {
                b bVar = this.f64741c.get(i11);
                if (bVar.f64739a == i10) {
                    return bVar;
                }
            }
            return null;
        }

        @Override // io.odeeo.internal.n.a
        public String toString() {
            return a.getAtomTypeString(this.f64739a) + " leaves: " + Arrays.toString(this.f64741c.toArray()) + " containers: " + Arrays.toString(this.f64742d.toArray());
        }

        public void add(C0622a c0622a) {
            this.f64742d.add(c0622a);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends a {

        /* renamed from: b, reason: collision with root package name */
        public final x f64743b;

        public b(int i10, x xVar) {
            super(i10);
            this.f64743b = xVar;
        }
    }

    public a(int i10) {
        this.f64739a = i10;
    }

    public static int parseFullAtomFlags(int i10) {
        return i10 & 16777215;
    }

    public static int parseFullAtomVersion(int i10) {
        return (i10 >> 24) & 255;
    }

    public String toString() {
        return getAtomTypeString(this.f64739a);
    }

    public static String getAtomTypeString(int i10) {
        return DwaEpyvxz.EwQAbCl + ((char) ((i10 >> 24) & 255)) + ((char) ((i10 >> 16) & 255)) + ((char) ((i10 >> 8) & 255)) + ((char) (i10 & 255));
    }
}
