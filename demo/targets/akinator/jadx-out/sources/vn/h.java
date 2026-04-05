package vn;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import gn.w;
import io.bidmachine.media3.common.DrmInitData;
import io.bidmachine.media3.common.StreamKey;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class h extends i {

    /* renamed from: n, reason: collision with root package name */
    public static final h f89428n;

    /* renamed from: d, reason: collision with root package name */
    public final List f89429d;

    /* renamed from: e, reason: collision with root package name */
    public final List f89430e;

    /* renamed from: f, reason: collision with root package name */
    public final List f89431f;

    /* renamed from: g, reason: collision with root package name */
    public final List f89432g;

    /* renamed from: h, reason: collision with root package name */
    public final List f89433h;

    /* renamed from: i, reason: collision with root package name */
    public final List f89434i;

    /* renamed from: j, reason: collision with root package name */
    public final io.bidmachine.media3.common.b f89435j;

    /* renamed from: k, reason: collision with root package name */
    public final List f89436k;

    /* renamed from: l, reason: collision with root package name */
    public final Map f89437l;

    /* renamed from: m, reason: collision with root package name */
    public final List f89438m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f89439a;

        /* renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f89440b;

        /* renamed from: c, reason: collision with root package name */
        public final String f89441c;

        public a(Uri uri, io.bidmachine.media3.common.b bVar, String str, String str2) {
            this.f89439a = uri;
            this.f89440b = bVar;
            this.f89441c = str2;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final Uri f89442a;

        /* renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.common.b f89443b;

        /* renamed from: c, reason: collision with root package name */
        public final String f89444c;

        /* renamed from: d, reason: collision with root package name */
        public final String f89445d;

        /* renamed from: e, reason: collision with root package name */
        public final String f89446e;

        /* renamed from: f, reason: collision with root package name */
        public final String f89447f;

        public b(Uri uri, io.bidmachine.media3.common.b bVar, String str, String str2, String str3, String str4) {
            this.f89442a = uri;
            this.f89443b = bVar;
            this.f89444c = str;
            this.f89445d = str2;
            this.f89446e = str3;
            this.f89447f = str4;
        }

        public static b createMediaPlaylistVariantUrl(Uri uri) {
            return new b(uri, new w().setId("0").setContainerMimeType(MimeTypes.APPLICATION_M3U8).build(), null, null, null, null);
        }

        public b copyWithFormat(io.bidmachine.media3.common.b bVar) {
            return new b(this.f89442a, bVar, this.f89444c, this.f89445d, this.f89446e, this.f89447f);
        }
    }

    static {
        List list = Collections.EMPTY_LIST;
        f89428n = new h("", list, list, list, list, list, list, null, list, false, Collections.EMPTY_MAP, list);
    }

    public h(String str, List<String> list, List<b> list2, List<a> list3, List<a> list4, List<a> list5, List<a> list6, io.bidmachine.media3.common.b bVar, List<io.bidmachine.media3.common.b> list7, boolean z10, Map<String, String> map, List<DrmInitData> list8) {
        super(str, list, z10);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list2.size(); i10++) {
            Uri uri = list2.get(i10).f89442a;
            if (!arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
        a(list3, arrayList);
        a(list4, arrayList);
        a(list5, arrayList);
        a(list6, arrayList);
        this.f89429d = Collections.unmodifiableList(arrayList);
        this.f89430e = Collections.unmodifiableList(list2);
        this.f89431f = Collections.unmodifiableList(list3);
        this.f89432g = Collections.unmodifiableList(list4);
        this.f89433h = Collections.unmodifiableList(list5);
        this.f89434i = Collections.unmodifiableList(list6);
        this.f89435j = bVar;
        this.f89436k = list7 != null ? Collections.unmodifiableList(list7) : null;
        this.f89437l = Collections.unmodifiableMap(map);
        this.f89438m = Collections.unmodifiableList(list8);
    }

    public static void a(List list, ArrayList arrayList) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            Uri uri = ((a) list.get(i10)).f89439a;
            if (uri != null && !arrayList.contains(uri)) {
                arrayList.add(uri);
            }
        }
    }

    public static ArrayList b(List list, List list2, int i10) {
        ArrayList arrayList = new ArrayList(list2.size());
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            int i12 = 0;
            while (true) {
                if (i12 < list2.size()) {
                    StreamKey streamKey = (StreamKey) list2.get(i12);
                    if (streamKey.f60625c == i10 && streamKey.f60626e == i11) {
                        arrayList.add(obj);
                        break;
                    }
                    i12++;
                }
            }
        }
        return arrayList;
    }

    public static h createSingleVariantMultivariantPlaylist(String str) {
        List listSingletonList = Collections.singletonList(b.createMediaPlaylistVariantUrl(Uri.parse(str)));
        List list = Collections.EMPTY_LIST;
        return new h("", list, listSingletonList, list, list, list, list, null, null, false, Collections.EMPTY_MAP, list);
    }

    @Override // vn.i, zn.p
    public /* bridge */ /* synthetic */ Object copy(List list) {
        return copy((List<StreamKey>) list);
    }

    @Override // vn.i, zn.p
    public h copy(List<StreamKey> list) {
        ArrayList arrayListB = b(this.f89430e, list, 0);
        List list2 = Collections.EMPTY_LIST;
        return new h(this.f89448a, this.f89449b, arrayListB, list2, b(this.f89432g, list, 1), b(this.f89433h, list, 2), list2, this.f89435j, this.f89436k, this.f89450c, this.f89437l, this.f89438m);
    }
}
