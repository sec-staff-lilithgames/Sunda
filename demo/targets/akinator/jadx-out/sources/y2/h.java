package y2;

import a3.e0;
import a3.g0;
import a3.i0;
import io.bidmachine.protobuf.EventTypeExtended;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public c3.f f94018a;

    /* renamed from: b, reason: collision with root package name */
    public final a f94019b;

    /* renamed from: c, reason: collision with root package name */
    public final b f94020c;

    /* renamed from: d, reason: collision with root package name */
    public float f94021d;

    /* renamed from: e, reason: collision with root package name */
    public float f94022e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f94023a = null;

        /* renamed from: b, reason: collision with root package name */
        public String f94024b = null;

        /* renamed from: c, reason: collision with root package name */
        public int f94025c = -1;

        /* renamed from: d, reason: collision with root package name */
        public int f94026d = 0;

        /* renamed from: e, reason: collision with root package name */
        public float f94027e = Float.NaN;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f94028a = 4;
    }

    public h() {
        this.f94018a = new c3.f();
        this.f94019b = new a();
        this.f94020c = new b();
    }

    public h findViewById(int i10) {
        return null;
    }

    public float getAlpha() {
        return this.f94018a.f11792p;
    }

    public int getBottom() {
        return this.f94018a.f11781e;
    }

    public c getCustomAttribute(String str) {
        return this.f94018a.getCustomAttribute(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.f94018a.getCustomAttributeNames();
    }

    public int getHeight() {
        c3.f fVar = this.f94018a;
        return fVar.f11781e - fVar.f11779c;
    }

    @Override // a3.i0
    public int getId(String str) {
        int id2 = e0.getId(str);
        return id2 != -1 ? id2 : g0.getId(str);
    }

    public int getLeft() {
        return this.f94018a.f11778b;
    }

    public String getName() {
        return this.f94018a.getId();
    }

    public h getParent() {
        return null;
    }

    public float getPivotX() {
        return this.f94018a.f11782f;
    }

    public float getPivotY() {
        return this.f94018a.f11783g;
    }

    public int getRight() {
        return this.f94018a.f11780d;
    }

    public float getRotationX() {
        return this.f94018a.f11784h;
    }

    public float getRotationY() {
        return this.f94018a.f11785i;
    }

    public float getRotationZ() {
        return this.f94018a.f11786j;
    }

    public float getScaleX() {
        return this.f94018a.f11790n;
    }

    public float getScaleY() {
        return this.f94018a.f11791o;
    }

    public int getTop() {
        return this.f94018a.f11779c;
    }

    public float getTranslationX() {
        return this.f94018a.f11787k;
    }

    public float getTranslationY() {
        return this.f94018a.f11788l;
    }

    public float getTranslationZ() {
        return this.f94018a.f11789m;
    }

    public float getValueAttributes(int i10) {
        switch (i10) {
            case 303:
                return this.f94018a.f11792p;
            case AD_EXPIRED_VALUE:
                return this.f94018a.f11787k;
            case MRAID_BRIDGE_ERROR_VALUE:
                return this.f94018a.f11788l;
            case 306:
                return this.f94018a.f11789m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f94018a.f11784h;
            case ASSET_FAILED_TO_DELETE_VALUE:
                return this.f94018a.f11785i;
            case AD_HTML_FAILED_TO_LOAD_VALUE:
                return this.f94018a.f11786j;
            case MRAID_JS_CALL_EMPTY_VALUE:
                return this.f94018a.f11790n;
            case DEEPLINK_OPEN_FAILED_VALUE:
                return this.f94018a.f11791o;
            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                return this.f94018a.f11782f;
            case LINK_COMMAND_OPEN_FAILED_VALUE:
                return this.f94018a.f11783g;
            case JSON_PARAMS_ENCODE_ERROR_VALUE:
                return this.f94021d;
            case GENERATE_JSON_DATA_ERROR_VALUE:
                return this.f94022e;
        }
    }

    public int getVisibility() {
        return this.f94020c.f94028a;
    }

    public c3.f getWidgetFrame() {
        return this.f94018a;
    }

    public int getWidth() {
        c3.f fVar = this.f94018a;
        return fVar.f11780d - fVar.f11778b;
    }

    public int getX() {
        return this.f94018a.f11778b;
    }

    public int getY() {
        return this.f94018a.f11779c;
    }

    public void layout(int i10, int i11, int i12, int i13) {
        setBounds(i10, i11, i12, i13);
    }

    public void setBounds(int i10, int i11, int i12, int i13) {
        if (this.f94018a == null) {
            this.f94018a = new c3.f((d3.g) null);
        }
        c3.f fVar = this.f94018a;
        fVar.f11779c = i11;
        fVar.f11778b = i10;
        fVar.f11780d = i12;
        fVar.f11781e = i13;
    }

    public void setCustomAttribute(String str, int i10, float f10) {
        this.f94018a.setCustomAttribute(str, i10, f10);
    }

    public void setInterpolatedValue(y2.b bVar, float[] fArr) {
        this.f94018a.setCustomAttribute(bVar.f93947a, EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, fArr[0]);
    }

    public void setPivotX(float f10) {
        this.f94018a.f11782f = f10;
    }

    public void setPivotY(float f10) {
        this.f94018a.f11783g = f10;
    }

    public void setRotationX(float f10) {
        this.f94018a.f11784h = f10;
    }

    public void setRotationY(float f10) {
        this.f94018a.f11785i = f10;
    }

    public void setRotationZ(float f10) {
        this.f94018a.f11786j = f10;
    }

    public void setScaleX(float f10) {
        this.f94018a.f11790n = f10;
    }

    public void setScaleY(float f10) {
        this.f94018a.f11791o = f10;
    }

    public void setTranslationX(float f10) {
        this.f94018a.f11787k = f10;
    }

    public void setTranslationY(float f10) {
        this.f94018a.f11788l = f10;
    }

    public void setTranslationZ(float f10) {
        this.f94018a.f11789m = f10;
    }

    @Override // a3.i0
    public boolean setValue(int i10, int i11) {
        if (setValueAttributes(i10, i11)) {
            return true;
        }
        return setValueMotion(i10, i11);
    }

    public boolean setValueAttributes(int i10, float f10) {
        switch (i10) {
            case 303:
                this.f94018a.f11792p = f10;
                return true;
            case AD_EXPIRED_VALUE:
                this.f94018a.f11787k = f10;
                return true;
            case MRAID_BRIDGE_ERROR_VALUE:
                this.f94018a.f11788l = f10;
                return true;
            case 306:
                this.f94018a.f11789m = f10;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f94018a.f11784h = f10;
                return true;
            case ASSET_FAILED_TO_DELETE_VALUE:
                this.f94018a.f11785i = f10;
                return true;
            case AD_HTML_FAILED_TO_LOAD_VALUE:
                this.f94018a.f11786j = f10;
                return true;
            case MRAID_JS_CALL_EMPTY_VALUE:
                this.f94018a.f11790n = f10;
                return true;
            case DEEPLINK_OPEN_FAILED_VALUE:
                this.f94018a.f11791o = f10;
                return true;
            case EVALUATE_JAVASCRIPT_FAILED_VALUE:
                this.f94018a.f11782f = f10;
                return true;
            case LINK_COMMAND_OPEN_FAILED_VALUE:
                this.f94018a.f11783g = f10;
                return true;
            case JSON_PARAMS_ENCODE_ERROR_VALUE:
                this.f94021d = f10;
                return true;
            case GENERATE_JSON_DATA_ERROR_VALUE:
                this.f94022e = f10;
                return true;
        }
    }

    public boolean setValueMotion(int i10, int i11) {
        a aVar = this.f94019b;
        switch (i10) {
            case 606:
                aVar.getClass();
                return true;
            case 607:
                aVar.f94025c = i11;
                return true;
            case 608:
                aVar.f94026d = i11;
                return true;
            case 609:
                aVar.getClass();
                return true;
            case 610:
                aVar.getClass();
                return true;
            case 611:
                aVar.getClass();
                return true;
            case 612:
                aVar.getClass();
                return true;
            default:
                return false;
        }
    }

    public void setVisibility(int i10) {
        this.f94020c.f94028a = i10;
    }

    public String toString() {
        return this.f94018a.f11778b + ", " + this.f94018a.f11779c + ", " + this.f94018a.f11780d + ", " + this.f94018a.f11781e;
    }

    public void updateMotion(i0 i0Var) {
        if (this.f94018a.getMotionProperties() != null) {
            this.f94018a.getMotionProperties().applyDelta(i0Var);
        }
    }

    public void setCustomAttribute(String str, int i10, int i11) {
        this.f94018a.setCustomAttribute(str, i10, i11);
    }

    public void setCustomAttribute(String str, int i10, boolean z10) {
        this.f94018a.setCustomAttribute(str, i10, z10);
    }

    @Override // a3.i0
    public boolean setValue(int i10, float f10) {
        if (setValueAttributes(i10, f10)) {
            return true;
        }
        return setValueMotion(i10, f10);
    }

    public void setCustomAttribute(String str, int i10, String str2) {
        this.f94018a.setCustomAttribute(str, i10, str2);
    }

    public h(c3.f fVar) {
        this.f94018a = new c3.f();
        this.f94019b = new a();
        this.f94020c = new b();
        this.f94018a = fVar;
    }

    @Override // a3.i0
    public boolean setValue(int i10, String str) {
        if (i10 == 605) {
            this.f94019b.f94023a = str;
            return true;
        }
        return setValueMotion(i10, str);
    }

    @Override // a3.i0
    public boolean setValue(int i10, boolean z10) {
        return false;
    }

    public boolean setValueMotion(int i10, String str) {
        a aVar = this.f94019b;
        if (i10 == 603) {
            aVar.f94024b = str;
            return true;
        }
        if (i10 != 604) {
            return false;
        }
        aVar.getClass();
        return true;
    }

    public boolean setValueMotion(int i10, float f10) {
        a aVar = this.f94019b;
        switch (i10) {
            case 600:
                aVar.getClass();
                return true;
            case 601:
                aVar.f94027e = f10;
                return true;
            case 602:
                aVar.getClass();
                return true;
            default:
                return false;
        }
    }
}
