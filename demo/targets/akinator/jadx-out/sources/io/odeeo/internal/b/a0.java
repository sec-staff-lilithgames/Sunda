package io.odeeo.internal.b;

import android.net.Uri;
import android.os.Bundle;
import io.odeeo.internal.b.g;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a0 implements g {
    public static final a0 H = new b().build();
    public static final g.a<a0> I = new hv.t(24);
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f62555a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f62556b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f62557c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f62558d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f62559e;

    /* renamed from: f, reason: collision with root package name */
    public final CharSequence f62560f;

    /* renamed from: g, reason: collision with root package name */
    public final CharSequence f62561g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f62562h;

    /* renamed from: i, reason: collision with root package name */
    public final o0 f62563i;

    /* renamed from: j, reason: collision with root package name */
    public final o0 f62564j;

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f62565k;

    /* renamed from: l, reason: collision with root package name */
    public final Integer f62566l;

    /* renamed from: m, reason: collision with root package name */
    public final Uri f62567m;

    /* renamed from: n, reason: collision with root package name */
    public final Integer f62568n;

    /* renamed from: o, reason: collision with root package name */
    public final Integer f62569o;

    /* renamed from: p, reason: collision with root package name */
    public final Integer f62570p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f62571q;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public final Integer f62572r;

    /* renamed from: s, reason: collision with root package name */
    public final Integer f62573s;

    /* renamed from: t, reason: collision with root package name */
    public final Integer f62574t;

    /* renamed from: u, reason: collision with root package name */
    public final Integer f62575u;

    /* renamed from: v, reason: collision with root package name */
    public final Integer f62576v;

    /* renamed from: w, reason: collision with root package name */
    public final Integer f62577w;

    /* renamed from: x, reason: collision with root package name */
    public final Integer f62578x;

    /* renamed from: y, reason: collision with root package name */
    public final CharSequence f62579y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f62580z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public Integer A;
        public Integer B;
        public CharSequence C;
        public CharSequence D;
        public CharSequence E;
        public Bundle F;

        /* renamed from: a, reason: collision with root package name */
        public CharSequence f62581a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f62582b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f62583c;

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f62584d;

        /* renamed from: e, reason: collision with root package name */
        public CharSequence f62585e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f62586f;

        /* renamed from: g, reason: collision with root package name */
        public CharSequence f62587g;

        /* renamed from: h, reason: collision with root package name */
        public Uri f62588h;

        /* renamed from: i, reason: collision with root package name */
        public o0 f62589i;

        /* renamed from: j, reason: collision with root package name */
        public o0 f62590j;

        /* renamed from: k, reason: collision with root package name */
        public byte[] f62591k;

        /* renamed from: l, reason: collision with root package name */
        public Integer f62592l;

        /* renamed from: m, reason: collision with root package name */
        public Uri f62593m;

        /* renamed from: n, reason: collision with root package name */
        public Integer f62594n;

        /* renamed from: o, reason: collision with root package name */
        public Integer f62595o;

        /* renamed from: p, reason: collision with root package name */
        public Integer f62596p;

        /* renamed from: q, reason: collision with root package name */
        public Boolean f62597q;

        /* renamed from: r, reason: collision with root package name */
        public Integer f62598r;

        /* renamed from: s, reason: collision with root package name */
        public Integer f62599s;

        /* renamed from: t, reason: collision with root package name */
        public Integer f62600t;

        /* renamed from: u, reason: collision with root package name */
        public Integer f62601u;

        /* renamed from: v, reason: collision with root package name */
        public Integer f62602v;

        /* renamed from: w, reason: collision with root package name */
        public Integer f62603w;

        /* renamed from: x, reason: collision with root package name */
        public CharSequence f62604x;

        /* renamed from: y, reason: collision with root package name */
        public CharSequence f62605y;

        /* renamed from: z, reason: collision with root package name */
        public CharSequence f62606z;

        public b() {
        }

        public a0 build() {
            return new a0(this);
        }

        public b maybeSetArtworkData(byte[] bArr, int i10) {
            if (this.f62591k != null && !io.odeeo.internal.q0.g0.areEqual(Integer.valueOf(i10), 3) && io.odeeo.internal.q0.g0.areEqual(this.f62592l, 3)) {
                return this;
            }
            this.f62591k = (byte[]) bArr.clone();
            this.f62592l = Integer.valueOf(i10);
            return this;
        }

        public b populate(a0 a0Var) {
            if (a0Var != null) {
                CharSequence charSequence = a0Var.f62555a;
                if (charSequence != null) {
                    setTitle(charSequence);
                }
                CharSequence charSequence2 = a0Var.f62556b;
                if (charSequence2 != null) {
                    setArtist(charSequence2);
                }
                CharSequence charSequence3 = a0Var.f62557c;
                if (charSequence3 != null) {
                    setAlbumTitle(charSequence3);
                }
                CharSequence charSequence4 = a0Var.f62558d;
                if (charSequence4 != null) {
                    setAlbumArtist(charSequence4);
                }
                CharSequence charSequence5 = a0Var.f62559e;
                if (charSequence5 != null) {
                    setDisplayTitle(charSequence5);
                }
                CharSequence charSequence6 = a0Var.f62560f;
                if (charSequence6 != null) {
                    setSubtitle(charSequence6);
                }
                CharSequence charSequence7 = a0Var.f62561g;
                if (charSequence7 != null) {
                    setDescription(charSequence7);
                }
                Uri uri = a0Var.f62562h;
                if (uri != null) {
                    setMediaUri(uri);
                }
                o0 o0Var = a0Var.f62563i;
                if (o0Var != null) {
                    setUserRating(o0Var);
                }
                o0 o0Var2 = a0Var.f62564j;
                if (o0Var2 != null) {
                    setOverallRating(o0Var2);
                }
                byte[] bArr = a0Var.f62565k;
                if (bArr != null) {
                    setArtworkData(bArr, a0Var.f62566l);
                }
                Uri uri2 = a0Var.f62567m;
                if (uri2 != null) {
                    setArtworkUri(uri2);
                }
                Integer num = a0Var.f62568n;
                if (num != null) {
                    setTrackNumber(num);
                }
                Integer num2 = a0Var.f62569o;
                if (num2 != null) {
                    setTotalTrackCount(num2);
                }
                Integer num3 = a0Var.f62570p;
                if (num3 != null) {
                    setFolderType(num3);
                }
                Boolean bool = a0Var.f62571q;
                if (bool != null) {
                    setIsPlayable(bool);
                }
                Integer num4 = a0Var.f62572r;
                if (num4 != null) {
                    setRecordingYear(num4);
                }
                Integer num5 = a0Var.f62573s;
                if (num5 != null) {
                    setRecordingYear(num5);
                }
                Integer num6 = a0Var.f62574t;
                if (num6 != null) {
                    setRecordingMonth(num6);
                }
                Integer num7 = a0Var.f62575u;
                if (num7 != null) {
                    setRecordingDay(num7);
                }
                Integer num8 = a0Var.f62576v;
                if (num8 != null) {
                    setReleaseYear(num8);
                }
                Integer num9 = a0Var.f62577w;
                if (num9 != null) {
                    setReleaseMonth(num9);
                }
                Integer num10 = a0Var.f62578x;
                if (num10 != null) {
                    setReleaseDay(num10);
                }
                CharSequence charSequence8 = a0Var.f62579y;
                if (charSequence8 != null) {
                    setWriter(charSequence8);
                }
                CharSequence charSequence9 = a0Var.f62580z;
                if (charSequence9 != null) {
                    setComposer(charSequence9);
                }
                CharSequence charSequence10 = a0Var.A;
                if (charSequence10 != null) {
                    setConductor(charSequence10);
                }
                Integer num11 = a0Var.B;
                if (num11 != null) {
                    setDiscNumber(num11);
                }
                Integer num12 = a0Var.C;
                if (num12 != null) {
                    setTotalDiscCount(num12);
                }
                CharSequence charSequence11 = a0Var.D;
                if (charSequence11 != null) {
                    setGenre(charSequence11);
                }
                CharSequence charSequence12 = a0Var.E;
                if (charSequence12 != null) {
                    setCompilation(charSequence12);
                }
                CharSequence charSequence13 = a0Var.F;
                if (charSequence13 != null) {
                    setStation(charSequence13);
                }
                Bundle bundle = a0Var.G;
                if (bundle != null) {
                    setExtras(bundle);
                }
            }
            return this;
        }

        public b populateFromMetadata(io.odeeo.internal.s.a aVar) {
            for (int i10 = 0; i10 < aVar.length(); i10++) {
                aVar.get(i10).populateMediaMetadata(this);
            }
            return this;
        }

        public b setAlbumArtist(CharSequence charSequence) {
            this.f62584d = charSequence;
            return this;
        }

        public b setAlbumTitle(CharSequence charSequence) {
            this.f62583c = charSequence;
            return this;
        }

        public b setArtist(CharSequence charSequence) {
            this.f62582b = charSequence;
            return this;
        }

        @Deprecated
        public b setArtworkData(byte[] bArr) {
            return setArtworkData(bArr, null);
        }

        public b setArtworkUri(Uri uri) {
            this.f62593m = uri;
            return this;
        }

        public b setCompilation(CharSequence charSequence) {
            this.D = charSequence;
            return this;
        }

        public b setComposer(CharSequence charSequence) {
            this.f62605y = charSequence;
            return this;
        }

        public b setConductor(CharSequence charSequence) {
            this.f62606z = charSequence;
            return this;
        }

        public b setDescription(CharSequence charSequence) {
            this.f62587g = charSequence;
            return this;
        }

        public b setDiscNumber(Integer num) {
            this.A = num;
            return this;
        }

        public b setDisplayTitle(CharSequence charSequence) {
            this.f62585e = charSequence;
            return this;
        }

        public b setExtras(Bundle bundle) {
            this.F = bundle;
            return this;
        }

        public b setFolderType(Integer num) {
            this.f62596p = num;
            return this;
        }

        public b setGenre(CharSequence charSequence) {
            this.C = charSequence;
            return this;
        }

        public b setIsPlayable(Boolean bool) {
            this.f62597q = bool;
            return this;
        }

        public b setMediaUri(Uri uri) {
            this.f62588h = uri;
            return this;
        }

        public b setOverallRating(o0 o0Var) {
            this.f62590j = o0Var;
            return this;
        }

        public b setRecordingDay(Integer num) {
            this.f62600t = num;
            return this;
        }

        public b setRecordingMonth(Integer num) {
            this.f62599s = num;
            return this;
        }

        public b setRecordingYear(Integer num) {
            this.f62598r = num;
            return this;
        }

        public b setReleaseDay(Integer num) {
            this.f62603w = num;
            return this;
        }

        public b setReleaseMonth(Integer num) {
            this.f62602v = num;
            return this;
        }

        public b setReleaseYear(Integer num) {
            this.f62601u = num;
            return this;
        }

        public b setStation(CharSequence charSequence) {
            this.E = charSequence;
            return this;
        }

        public b setSubtitle(CharSequence charSequence) {
            this.f62586f = charSequence;
            return this;
        }

        public b setTitle(CharSequence charSequence) {
            this.f62581a = charSequence;
            return this;
        }

        public b setTotalDiscCount(Integer num) {
            this.B = num;
            return this;
        }

        public b setTotalTrackCount(Integer num) {
            this.f62595o = num;
            return this;
        }

        public b setTrackNumber(Integer num) {
            this.f62594n = num;
            return this;
        }

        public b setUserRating(o0 o0Var) {
            this.f62589i = o0Var;
            return this;
        }

        public b setWriter(CharSequence charSequence) {
            this.f62604x = charSequence;
            return this;
        }

        @Deprecated
        public b setYear(Integer num) {
            return setRecordingYear(num);
        }

        public b setArtworkData(byte[] bArr, Integer num) {
            this.f62591k = bArr == null ? null : (byte[]) bArr.clone();
            this.f62592l = num;
            return this;
        }

        public b(a0 a0Var) {
            this.f62581a = a0Var.f62555a;
            this.f62582b = a0Var.f62556b;
            this.f62583c = a0Var.f62557c;
            this.f62584d = a0Var.f62558d;
            this.f62585e = a0Var.f62559e;
            this.f62586f = a0Var.f62560f;
            this.f62587g = a0Var.f62561g;
            this.f62588h = a0Var.f62562h;
            this.f62589i = a0Var.f62563i;
            this.f62590j = a0Var.f62564j;
            this.f62591k = a0Var.f62565k;
            this.f62592l = a0Var.f62566l;
            this.f62593m = a0Var.f62567m;
            this.f62594n = a0Var.f62568n;
            this.f62595o = a0Var.f62569o;
            this.f62596p = a0Var.f62570p;
            this.f62597q = a0Var.f62571q;
            this.f62598r = a0Var.f62573s;
            this.f62599s = a0Var.f62574t;
            this.f62600t = a0Var.f62575u;
            this.f62601u = a0Var.f62576v;
            this.f62602v = a0Var.f62577w;
            this.f62603w = a0Var.f62578x;
            this.f62604x = a0Var.f62579y;
            this.f62605y = a0Var.f62580z;
            this.f62606z = a0Var.A;
            this.A = a0Var.B;
            this.B = a0Var.C;
            this.C = a0Var.D;
            this.D = a0Var.E;
            this.E = a0Var.F;
            this.F = a0Var.G;
        }

        public b populateFromMetadata(List<io.odeeo.internal.s.a> list) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                io.odeeo.internal.s.a aVar = list.get(i10);
                for (int i11 = 0; i11 < aVar.length(); i11++) {
                    aVar.get(i11).populateMediaMetadata(this);
                }
            }
            return this;
        }
    }

    public static a0 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        b bVar = new b();
        bVar.setTitle(bundle.getCharSequence(a(0))).setArtist(bundle.getCharSequence(a(1))).setAlbumTitle(bundle.getCharSequence(a(2))).setAlbumArtist(bundle.getCharSequence(a(3))).setDisplayTitle(bundle.getCharSequence(a(4))).setSubtitle(bundle.getCharSequence(a(5))).setDescription(bundle.getCharSequence(a(6))).setMediaUri((Uri) bundle.getParcelable(a(7))).setArtworkData(bundle.getByteArray(a(10)), bundle.containsKey(a(29)) ? Integer.valueOf(bundle.getInt(a(29))) : null).setArtworkUri((Uri) bundle.getParcelable(a(11))).setWriter(bundle.getCharSequence(a(22))).setComposer(bundle.getCharSequence(a(23))).setConductor(bundle.getCharSequence(a(24))).setGenre(bundle.getCharSequence(a(27))).setCompilation(bundle.getCharSequence(a(28))).setStation(bundle.getCharSequence(a(30))).setExtras(bundle.getBundle(a(1000)));
        if (bundle.containsKey(a(8)) && (bundle3 = bundle.getBundle(a(8))) != null) {
            bVar.setUserRating((o0) o0.f62873a.mo3834fromBundle(bundle3));
        }
        if (bundle.containsKey(a(9)) && (bundle2 = bundle.getBundle(a(9))) != null) {
            bVar.setOverallRating((o0) o0.f62873a.mo3834fromBundle(bundle2));
        }
        if (bundle.containsKey(a(12))) {
            bVar.setTrackNumber(Integer.valueOf(bundle.getInt(a(12))));
        }
        if (bundle.containsKey(a(13))) {
            bVar.setTotalTrackCount(Integer.valueOf(bundle.getInt(a(13))));
        }
        if (bundle.containsKey(a(14))) {
            bVar.setFolderType(Integer.valueOf(bundle.getInt(a(14))));
        }
        if (bundle.containsKey(a(15))) {
            bVar.setIsPlayable(Boolean.valueOf(bundle.getBoolean(a(15))));
        }
        if (bundle.containsKey(a(16))) {
            bVar.setRecordingYear(Integer.valueOf(bundle.getInt(a(16))));
        }
        if (bundle.containsKey(a(17))) {
            bVar.setRecordingMonth(Integer.valueOf(bundle.getInt(a(17))));
        }
        if (bundle.containsKey(a(18))) {
            bVar.setRecordingDay(Integer.valueOf(bundle.getInt(a(18))));
        }
        if (bundle.containsKey(a(19))) {
            bVar.setReleaseYear(Integer.valueOf(bundle.getInt(a(19))));
        }
        if (bundle.containsKey(a(20))) {
            bVar.setReleaseMonth(Integer.valueOf(bundle.getInt(a(20))));
        }
        if (bundle.containsKey(a(21))) {
            bVar.setReleaseDay(Integer.valueOf(bundle.getInt(a(21))));
        }
        if (bundle.containsKey(a(25))) {
            bVar.setDiscNumber(Integer.valueOf(bundle.getInt(a(25))));
        }
        if (bundle.containsKey(a(26))) {
            bVar.setTotalDiscCount(Integer.valueOf(bundle.getInt(a(26))));
        }
        return bVar.build();
    }

    public b buildUpon() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a0.class == obj.getClass()) {
            a0 a0Var = (a0) obj;
            if (io.odeeo.internal.q0.g0.areEqual(this.f62555a, a0Var.f62555a) && io.odeeo.internal.q0.g0.areEqual(this.f62556b, a0Var.f62556b) && io.odeeo.internal.q0.g0.areEqual(this.f62557c, a0Var.f62557c) && io.odeeo.internal.q0.g0.areEqual(this.f62558d, a0Var.f62558d) && io.odeeo.internal.q0.g0.areEqual(this.f62559e, a0Var.f62559e) && io.odeeo.internal.q0.g0.areEqual(this.f62560f, a0Var.f62560f) && io.odeeo.internal.q0.g0.areEqual(this.f62561g, a0Var.f62561g) && io.odeeo.internal.q0.g0.areEqual(this.f62562h, a0Var.f62562h) && io.odeeo.internal.q0.g0.areEqual(this.f62563i, a0Var.f62563i) && io.odeeo.internal.q0.g0.areEqual(this.f62564j, a0Var.f62564j) && Arrays.equals(this.f62565k, a0Var.f62565k) && io.odeeo.internal.q0.g0.areEqual(this.f62566l, a0Var.f62566l) && io.odeeo.internal.q0.g0.areEqual(this.f62567m, a0Var.f62567m) && io.odeeo.internal.q0.g0.areEqual(this.f62568n, a0Var.f62568n) && io.odeeo.internal.q0.g0.areEqual(this.f62569o, a0Var.f62569o) && io.odeeo.internal.q0.g0.areEqual(this.f62570p, a0Var.f62570p) && io.odeeo.internal.q0.g0.areEqual(this.f62571q, a0Var.f62571q) && io.odeeo.internal.q0.g0.areEqual(this.f62573s, a0Var.f62573s) && io.odeeo.internal.q0.g0.areEqual(this.f62574t, a0Var.f62574t) && io.odeeo.internal.q0.g0.areEqual(this.f62575u, a0Var.f62575u) && io.odeeo.internal.q0.g0.areEqual(this.f62576v, a0Var.f62576v) && io.odeeo.internal.q0.g0.areEqual(this.f62577w, a0Var.f62577w) && io.odeeo.internal.q0.g0.areEqual(this.f62578x, a0Var.f62578x) && io.odeeo.internal.q0.g0.areEqual(this.f62579y, a0Var.f62579y) && io.odeeo.internal.q0.g0.areEqual(this.f62580z, a0Var.f62580z) && io.odeeo.internal.q0.g0.areEqual(this.A, a0Var.A) && io.odeeo.internal.q0.g0.areEqual(this.B, a0Var.B) && io.odeeo.internal.q0.g0.areEqual(this.C, a0Var.C) && io.odeeo.internal.q0.g0.areEqual(this.D, a0Var.D) && io.odeeo.internal.q0.g0.areEqual(this.E, a0Var.E) && io.odeeo.internal.q0.g0.areEqual(this.F, a0Var.F)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.odeeo.internal.t0.p.hashCode(this.f62555a, this.f62556b, this.f62557c, this.f62558d, this.f62559e, this.f62560f, this.f62561g, this.f62562h, this.f62563i, this.f62564j, Integer.valueOf(Arrays.hashCode(this.f62565k)), this.f62566l, this.f62567m, this.f62568n, this.f62569o, this.f62570p, this.f62571q, this.f62573s, this.f62574t, this.f62575u, this.f62576v, this.f62577w, this.f62578x, this.f62579y, this.f62580z, this.A, this.B, this.C, this.D, this.E, this.F);
    }

    @Override // io.odeeo.internal.b.g
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence(a(0), this.f62555a);
        bundle.putCharSequence(a(1), this.f62556b);
        bundle.putCharSequence(a(2), this.f62557c);
        bundle.putCharSequence(a(3), this.f62558d);
        bundle.putCharSequence(a(4), this.f62559e);
        bundle.putCharSequence(a(5), this.f62560f);
        bundle.putCharSequence(a(6), this.f62561g);
        bundle.putParcelable(a(7), this.f62562h);
        bundle.putByteArray(a(10), this.f62565k);
        bundle.putParcelable(a(11), this.f62567m);
        bundle.putCharSequence(a(22), this.f62579y);
        bundle.putCharSequence(a(23), this.f62580z);
        bundle.putCharSequence(a(24), this.A);
        bundle.putCharSequence(a(27), this.D);
        bundle.putCharSequence(a(28), this.E);
        bundle.putCharSequence(a(30), this.F);
        if (this.f62563i != null) {
            bundle.putBundle(a(8), this.f62563i.toBundle());
        }
        if (this.f62564j != null) {
            bundle.putBundle(a(9), this.f62564j.toBundle());
        }
        if (this.f62568n != null) {
            bundle.putInt(a(12), this.f62568n.intValue());
        }
        if (this.f62569o != null) {
            bundle.putInt(a(13), this.f62569o.intValue());
        }
        if (this.f62570p != null) {
            bundle.putInt(a(14), this.f62570p.intValue());
        }
        if (this.f62571q != null) {
            bundle.putBoolean(a(15), this.f62571q.booleanValue());
        }
        if (this.f62573s != null) {
            bundle.putInt(a(16), this.f62573s.intValue());
        }
        if (this.f62574t != null) {
            bundle.putInt(a(17), this.f62574t.intValue());
        }
        if (this.f62575u != null) {
            bundle.putInt(a(18), this.f62575u.intValue());
        }
        if (this.f62576v != null) {
            bundle.putInt(a(19), this.f62576v.intValue());
        }
        if (this.f62577w != null) {
            bundle.putInt(a(20), this.f62577w.intValue());
        }
        if (this.f62578x != null) {
            bundle.putInt(a(21), this.f62578x.intValue());
        }
        if (this.B != null) {
            bundle.putInt(a(25), this.B.intValue());
        }
        if (this.C != null) {
            bundle.putInt(a(26), this.C.intValue());
        }
        if (this.f62566l != null) {
            bundle.putInt(a(29), this.f62566l.intValue());
        }
        if (this.G != null) {
            bundle.putBundle(a(1000), this.G);
        }
        return bundle;
    }

    public a0(b bVar) {
        this.f62555a = bVar.f62581a;
        this.f62556b = bVar.f62582b;
        this.f62557c = bVar.f62583c;
        this.f62558d = bVar.f62584d;
        this.f62559e = bVar.f62585e;
        this.f62560f = bVar.f62586f;
        this.f62561g = bVar.f62587g;
        this.f62562h = bVar.f62588h;
        this.f62563i = bVar.f62589i;
        this.f62564j = bVar.f62590j;
        this.f62565k = bVar.f62591k;
        this.f62566l = bVar.f62592l;
        this.f62567m = bVar.f62593m;
        this.f62568n = bVar.f62594n;
        this.f62569o = bVar.f62595o;
        this.f62570p = bVar.f62596p;
        this.f62571q = bVar.f62597q;
        this.f62572r = bVar.f62598r;
        this.f62573s = bVar.f62598r;
        this.f62574t = bVar.f62599s;
        this.f62575u = bVar.f62600t;
        this.f62576v = bVar.f62601u;
        this.f62577w = bVar.f62602v;
        this.f62578x = bVar.f62603w;
        this.f62579y = bVar.f62604x;
        this.f62580z = bVar.f62605y;
        this.A = bVar.f62606z;
        this.B = bVar.A;
        this.C = bVar.B;
        this.D = bVar.C;
        this.E = bVar.D;
        this.F = bVar.E;
        this.G = bVar.F;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
