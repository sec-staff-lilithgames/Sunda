package ub;

import com.fyber.inneractive.sdk.external.NativeAdContent;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public int f88378a;

    /* renamed from: b, reason: collision with root package name */
    public int f88379b;

    /* renamed from: c, reason: collision with root package name */
    public int f88380c;

    public y(y yVar) {
        this.f88378a = yVar.f88378a;
        this.f88379b = yVar.f88379b;
    }

    public final int getCurrentIndex() {
        int i10 = this.f88379b;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public abstract String getCurrentName();

    public Object getCurrentValue() {
        return null;
    }

    public final int getEntryCount() {
        return this.f88379b + 1;
    }

    public final int getNestingDepth() {
        return this.f88380c;
    }

    public abstract y getParent();

    @Deprecated
    public p getStartLocation(Object obj) {
        return p.f88312i;
    }

    @Deprecated
    public final String getTypeDesc() {
        int i10 = this.f88378a;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "OBJECT" : "ARRAY" : NativeAdContent.ViewTag.ROOT;
    }

    public boolean hasCurrentIndex() {
        return this.f88379b >= 0;
    }

    public boolean hasCurrentName() {
        return getCurrentName() != null;
    }

    public boolean hasPathSegment() {
        int i10 = this.f88378a;
        if (i10 == 2) {
            return hasCurrentName();
        }
        if (i10 == 1) {
            return hasCurrentIndex();
        }
        return false;
    }

    public final boolean inArray() {
        return this.f88378a == 1;
    }

    public final boolean inObject() {
        return this.f88378a == 2;
    }

    public final boolean inRoot() {
        return this.f88378a == 0;
    }

    public w pathAsPointer() {
        return w.forPath(this, false);
    }

    public p startLocation(cc.f fVar) {
        return p.f88312i;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this.f88378a;
        if (i10 == 0) {
            sb2.append("/");
        } else if (i10 != 1) {
            sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
            String currentName = getCurrentName();
            if (currentName != null) {
                sb2.append(AbstractJsonLexerKt.STRING);
                cc.d.appendQuoted(sb2, currentName);
                sb2.append(AbstractJsonLexerKt.STRING);
            } else {
                sb2.append('?');
            }
            sb2.append(AbstractJsonLexerKt.END_OBJ);
        } else {
            sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb2.append(getCurrentIndex());
            sb2.append(AbstractJsonLexerKt.END_LIST);
        }
        return sb2.toString();
    }

    public String typeDesc() {
        int i10 = this.f88378a;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "Object" : "Array" : "root";
    }

    public w pathAsPointer(boolean z10) {
        return w.forPath(this, z10);
    }

    public y(int i10) {
        this.f88378a = i10;
        this.f88379b = -1;
    }

    public void setCurrentValue(Object obj) {
    }
}
