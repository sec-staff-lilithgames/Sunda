package com.ironsource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface Y2 extends Lb<Integer, Integer> {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final a f35727a = new a();

        /* renamed from: b, reason: collision with root package name */
        public static final int f35728b = 3009;

        /* renamed from: c, reason: collision with root package name */
        public static final int f35729c = 3008;

        private a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f35730a = new b();

        /* renamed from: b, reason: collision with root package name */
        public static final int f35731b = 3002;

        /* renamed from: c, reason: collision with root package name */
        public static final int f35732c = 3005;

        /* renamed from: d, reason: collision with root package name */
        public static final int f35733d = 3300;

        /* renamed from: e, reason: collision with root package name */
        public static final int f35734e = 3503;

        /* renamed from: f, reason: collision with root package name */
        public static final int f35735f = 3504;

        private b() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c implements Y2 {
        @Override // com.ironsource.Lb
        public /* bridge */ /* synthetic */ Integer a(Integer num) {
            return a(num.intValue());
        }

        public Integer a(int i10) throws IllegalArgumentException {
            int i11;
            if (i10 == 206) {
                i11 = b.f35734e;
            } else if (i10 == 207) {
                i11 = b.f35735f;
            } else if (i10 == 405) {
                i11 = 3009;
            } else if (i10 != 406) {
                switch (i10) {
                    case 101:
                        i11 = 83500;
                        break;
                    case 102:
                        i11 = 83510;
                        break;
                    case 103:
                        i11 = d.f35743h;
                        break;
                    case 104:
                        i11 = 83300;
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
                                break;
                            case 112:
                                i11 = 3305;
                                break;
                            default:
                                switch (i10) {
                                    case 201:
                                        i11 = 3002;
                                        break;
                                    case 202:
                                        i11 = 3005;
                                        break;
                                    case 203:
                                        i11 = 3300;
                                        break;
                                    default:
                                        throw new IllegalArgumentException(a.b.e(i10, "Unknown event code: "));
                                }
                        }
                    case 105:
                        i11 = 83302;
                        break;
                }
            } else {
                i11 = 3008;
            }
            return Integer.valueOf(i11);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final d f35736a = new d();

        /* renamed from: b, reason: collision with root package name */
        public static final int f35737b = 83500;

        /* renamed from: c, reason: collision with root package name */
        public static final int f35738c = 83510;

        /* renamed from: d, reason: collision with root package name */
        public static final int f35739d = 83300;

        /* renamed from: e, reason: collision with root package name */
        public static final int f35740e = 83302;

        /* renamed from: f, reason: collision with root package name */
        public static final int f35741f = 83004;

        /* renamed from: g, reason: collision with root package name */
        public static final int f35742g = 88002;

        /* renamed from: h, reason: collision with root package name */
        public static final int f35743h = 83301;

        /* renamed from: i, reason: collision with root package name */
        public static final int f35744i = 83302;

        /* renamed from: j, reason: collision with root package name */
        public static final int f35745j = 3305;

        private d() {
        }
    }
}
