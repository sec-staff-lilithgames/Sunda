package hj;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class s {

    /* renamed from: a, reason: collision with root package name */
    public Float f58977a;

    /* renamed from: b, reason: collision with root package name */
    public Float f58978b;

    /* renamed from: c, reason: collision with root package name */
    public Float f58979c;

    /* renamed from: d, reason: collision with root package name */
    public Float f58980d;

    /* renamed from: e, reason: collision with root package name */
    public Integer f58981e;

    /* renamed from: f, reason: collision with root package name */
    public Integer f58982f;

    /* renamed from: g, reason: collision with root package name */
    public Integer f58983g;

    /* renamed from: h, reason: collision with root package name */
    public Integer f58984h;

    /* renamed from: i, reason: collision with root package name */
    public Integer f58985i;

    /* renamed from: j, reason: collision with root package name */
    public Integer f58986j;

    /* renamed from: k, reason: collision with root package name */
    public Boolean f58987k;

    /* renamed from: l, reason: collision with root package name */
    public Boolean f58988l;

    /* renamed from: m, reason: collision with root package name */
    public Boolean f58989m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final s f58990a = new s();

        public s build() {
            return this.f58990a;
        }

        public a setAnimate(Boolean bool) {
            this.f58990a.f58988l = bool;
            return this;
        }

        public a setAutoDismiss(Boolean bool) {
            this.f58990a.f58989m = bool;
            return this;
        }

        public a setBackgroundEnabled(Boolean bool) {
            this.f58990a.f58987k = bool;
            return this;
        }

        public a setMaxBodyHeightWeight(Float f10) {
            this.f58990a.f58979c = f10;
            return this;
        }

        public a setMaxBodyWidthWeight(Float f10) {
            this.f58990a.f58980d = f10;
            return this;
        }

        public a setMaxDialogHeightPx(Integer num) {
            this.f58990a.f58981e = num;
            return this;
        }

        public a setMaxDialogWidthPx(Integer num) {
            this.f58990a.f58982f = num;
            return this;
        }

        public a setMaxImageHeightWeight(Float f10) {
            this.f58990a.f58977a = f10;
            return this;
        }

        public a setMaxImageWidthWeight(Float f10) {
            this.f58990a.f58978b = f10;
            return this;
        }

        public a setViewWindowGravity(Integer num) {
            this.f58990a.f58984h = num;
            return this;
        }

        public a setWindowFlag(Integer num) {
            this.f58990a.f58983g = num;
            return this;
        }

        public a setWindowHeight(Integer num) {
            this.f58990a.f58986j = num;
            return this;
        }

        public a setWindowWidth(Integer num) {
            this.f58990a.f58985i = num;
            return this;
        }
    }

    public static a builder() {
        return new a();
    }

    public Boolean animate() {
        return this.f58988l;
    }

    public Boolean autoDismiss() {
        return this.f58989m;
    }

    public Boolean backgroundEnabled() {
        return this.f58987k;
    }

    public int getMaxBodyHeight() {
        return (int) (maxBodyHeightWeight().floatValue() * maxDialogHeightPx().intValue());
    }

    public int getMaxBodyWidth() {
        return (int) (maxBodyWidthWeight().floatValue() * maxDialogWidthPx().intValue());
    }

    public int getMaxImageHeight() {
        return (int) (maxImageHeightWeight().floatValue() * maxDialogHeightPx().intValue());
    }

    public int getMaxImageWidth() {
        return (int) (maxImageWidthWeight().floatValue() * maxDialogWidthPx().intValue());
    }

    public Float maxBodyHeightWeight() {
        return this.f58979c;
    }

    public Float maxBodyWidthWeight() {
        return this.f58980d;
    }

    public Integer maxDialogHeightPx() {
        return this.f58981e;
    }

    public Integer maxDialogWidthPx() {
        return this.f58982f;
    }

    public Float maxImageHeightWeight() {
        return this.f58977a;
    }

    public Float maxImageWidthWeight() {
        return this.f58978b;
    }

    public Integer viewWindowGravity() {
        return this.f58984h;
    }

    public Integer windowFlag() {
        return this.f58983g;
    }

    public Integer windowHeight() {
        return this.f58986j;
    }

    public Integer windowWidth() {
        return this.f58985i;
    }
}
