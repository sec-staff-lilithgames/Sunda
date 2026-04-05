package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface G9 extends Lb<Integer, Integer> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f34477a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f34478b = 2201;

        /* renamed from: c, reason: collision with root package name */
        public static final int f34479c = 2203;

        /* renamed from: d, reason: collision with root package name */
        public static final int f34480d = 2005;

        /* renamed from: e, reason: collision with root package name */
        public static final int f34481e = 2210;

        /* renamed from: f, reason: collision with root package name */
        public static final int f34482f = 2006;

        /* renamed from: g, reason: collision with root package name */
        public static final int f34483g = 2204;

        /* renamed from: h, reason: collision with root package name */
        public static final int f34484h = 2507;

        /* renamed from: i, reason: collision with root package name */
        public static final int f34485i = 2211;

        /* renamed from: j, reason: collision with root package name */
        public static final int f34486j = 2212;

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f34487a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f34488b = 2002;

        /* renamed from: c, reason: collision with root package name */
        public static final int f34489c = 2003;

        /* renamed from: d, reason: collision with root package name */
        public static final int f34490d = 2200;

        /* renamed from: e, reason: collision with root package name */
        public static final int f34491e = 2503;

        /* renamed from: f, reason: collision with root package name */
        public static final int f34492f = 2504;

        /* renamed from: g, reason: collision with root package name */
        public static final int f34493g = 2300;

        private b() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements G9 {
        @Override // com.ironsource.Lb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f34491e;
            } else if (i10 == 207) {
                i11 = b.f34492f;
            } else if (i10 == 401) {
                i11 = 2201;
            } else if (i10 == 410) {
                i11 = a.f34485i;
            } else if (i10 != 411) {
                switch (i10) {
                    case 101:
                        i11 = d.f34495b;
                        break;
                    case 102:
                        i11 = d.f34496c;
                        break;
                    case 103:
                        i11 = d.f34501h;
                        break;
                    case 104:
                        i11 = d.f34497d;
                        break;
                    case 105:
                        i11 = d.f34498e;
                        break;
                    default:
                        switch (i10) {
                            case 109:
                                i11 = 88002;
                                break;
                            case 110:
                                i11 = 83004;
                                break;
                            case 111:
                                i11 = d.f34502i;
                                break;
                            case 112:
                                i11 = d.f34503j;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 2002;
                                        break;
                                    case 202:
                                        i11 = 2003;
                                        break;
                                    case 203:
                                        i11 = 2200;
                                        break;
                                    case 204:
                                        i11 = b.f34493g;
                                        break;
                                    default:
                                        switch (i10) {
                                            case 403:
                                                i11 = 2203;
                                                break;
                                            case 404:
                                                i11 = 2005;
                                                break;
                                            case 405:
                                                i11 = a.f34481e;
                                                break;
                                            case 406:
                                                i11 = 2006;
                                                break;
                                            case 407:
                                                i11 = a.f34483g;
                                                break;
                                            case 408:
                                                i11 = a.f34484h;
                                                break;
                                            default:
                                                throw new IllegalArgumentException(a.b.e(i10, "Unknown event code: "));
                                        }
                                }
                        }
                }
            } else {
                i11 = a.f34486j;
            }
            return Integer.valueOf(i11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f34494a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final int f34495b = 82500;

        /* renamed from: c, reason: collision with root package name */
        public static final int f34496c = 82510;

        /* renamed from: d, reason: collision with root package name */
        public static final int f34497d = 82300;

        /* renamed from: e, reason: collision with root package name */
        public static final int f34498e = 82002;

        /* renamed from: f, reason: collision with root package name */
        public static final int f34499f = 83004;

        /* renamed from: g, reason: collision with root package name */
        public static final int f34500g = 88002;

        /* renamed from: h, reason: collision with root package name */
        public static final int f34501h = 82301;

        /* renamed from: i, reason: collision with root package name */
        public static final int f34502i = 82302;

        /* renamed from: j, reason: collision with root package name */
        public static final int f34503j = 82076;

        private d() {
        }
    }
}
