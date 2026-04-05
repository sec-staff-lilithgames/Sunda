package rc;

import com.ironsource.C3191e4;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import tb.l1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class i1 implements j1, Serializable {

    /* renamed from: h, reason: collision with root package name */
    public static final i1 f84200h;

    /* renamed from: i, reason: collision with root package name */
    public static final i1 f84201i;

    /* renamed from: b, reason: collision with root package name */
    public final tb.i f84202b;

    /* renamed from: c, reason: collision with root package name */
    public final tb.i f84203c;

    /* renamed from: e, reason: collision with root package name */
    public final tb.i f84204e;

    /* renamed from: f, reason: collision with root package name */
    public final tb.i f84205f;

    /* renamed from: g, reason: collision with root package name */
    public final tb.i f84206g;

    static {
        tb.i iVar = tb.i.f86726b;
        tb.i iVar2 = tb.i.f86728e;
        f84200h = new i1(iVar2, iVar2, iVar, iVar, iVar2);
        f84201i = new i1(iVar2, iVar2, iVar2, iVar2, iVar2);
    }

    public i1(tb.j jVar) {
        this.f84202b = jVar.getterVisibility();
        this.f84203c = jVar.isGetterVisibility();
        this.f84204e = jVar.setterVisibility();
        this.f84205f = jVar.creatorVisibility();
        this.f84206g = jVar.fieldVisibility();
    }

    public static i1 allPublicInstance() {
        return f84201i;
    }

    public static i1 construct(tb.h hVar) {
        return f84200h.withOverrides(hVar);
    }

    public static i1 defaultInstance() {
        return f84200h;
    }

    public final i1 a(tb.i iVar, tb.i iVar2, tb.i iVar3, tb.i iVar4, tb.i iVar5) {
        return (iVar == this.f84202b && iVar2 == this.f84203c && iVar3 == this.f84204e && iVar4 == this.f84205f && iVar5 == this.f84206g) ? this : new i1(iVar, iVar2, iVar3, iVar4, iVar5);
    }

    @Override // rc.j1
    public boolean isCreatorVisible(Member member) {
        return this.f84205f.isVisible(member);
    }

    @Override // rc.j1
    public boolean isFieldVisible(Field field) {
        return this.f84206g.isVisible(field);
    }

    @Override // rc.j1
    public boolean isGetterVisible(Method method) {
        return this.f84202b.isVisible(method);
    }

    @Override // rc.j1
    public boolean isIsGetterVisible(Method method) {
        return this.f84203c.isVisible(method);
    }

    @Override // rc.j1
    public boolean isSetterVisible(Method method) {
        return this.f84204e.isVisible(method);
    }

    public String toString() {
        return "[Visibility: getter=" + this.f84202b + ",isGetter=" + this.f84203c + ",setter=" + this.f84204e + ",creator=" + this.f84205f + ",field=" + this.f84206g + C3191e4.i.f36531e;
    }

    @Override // rc.j1
    public boolean isCreatorVisible(l lVar) {
        return isCreatorVisible(lVar.getMember());
    }

    @Override // rc.j1
    public boolean isFieldVisible(i iVar) {
        return isFieldVisible(iVar.getAnnotated());
    }

    @Override // rc.j1
    public boolean isGetterVisible(m mVar) {
        return isGetterVisible(mVar.getAnnotated());
    }

    @Override // rc.j1
    public boolean isIsGetterVisible(m mVar) {
        return isIsGetterVisible(mVar.getAnnotated());
    }

    @Override // rc.j1
    public boolean isSetterVisible(m mVar) {
        return isSetterVisible(mVar.getAnnotated());
    }

    @Override // rc.j1
    public i1 withCreatorVisibility(tb.i iVar) {
        if (iVar == tb.i.f86730g) {
            iVar = f84200h.f84205f;
        }
        tb.i iVar2 = iVar;
        if (this.f84205f == iVar2) {
            return this;
        }
        return new i1(this.f84202b, this.f84203c, this.f84204e, iVar2, this.f84206g);
    }

    @Override // rc.j1
    public i1 withFieldVisibility(tb.i iVar) {
        if (iVar == tb.i.f86730g) {
            iVar = f84200h.f84206g;
        }
        tb.i iVar2 = iVar;
        if (this.f84206g == iVar2) {
            return this;
        }
        return new i1(this.f84202b, this.f84203c, this.f84204e, this.f84205f, iVar2);
    }

    @Override // rc.j1
    public i1 withGetterVisibility(tb.i iVar) {
        if (iVar == tb.i.f86730g) {
            iVar = f84200h.f84202b;
        }
        tb.i iVar2 = iVar;
        if (this.f84202b == iVar2) {
            return this;
        }
        return new i1(iVar2, this.f84203c, this.f84204e, this.f84205f, this.f84206g);
    }

    @Override // rc.j1
    public i1 withIsGetterVisibility(tb.i iVar) {
        if (iVar == tb.i.f86730g) {
            iVar = f84200h.f84203c;
        }
        tb.i iVar2 = iVar;
        if (this.f84203c == iVar2) {
            return this;
        }
        return new i1(this.f84202b, iVar2, this.f84204e, this.f84205f, this.f84206g);
    }

    @Override // rc.j1
    public i1 withOverrides(tb.h hVar) {
        if (hVar == null) {
            return this;
        }
        tb.i getterVisibility = hVar.getGetterVisibility();
        tb.i iVar = tb.i.f86730g;
        if (getterVisibility == iVar) {
            getterVisibility = this.f84202b;
        }
        tb.i iVar2 = getterVisibility;
        tb.i isGetterVisibility = hVar.getIsGetterVisibility();
        if (isGetterVisibility == iVar) {
            isGetterVisibility = this.f84203c;
        }
        tb.i iVar3 = isGetterVisibility;
        tb.i setterVisibility = hVar.getSetterVisibility();
        if (setterVisibility == iVar) {
            setterVisibility = this.f84204e;
        }
        tb.i iVar4 = setterVisibility;
        tb.i creatorVisibility = hVar.getCreatorVisibility();
        if (creatorVisibility == iVar) {
            creatorVisibility = this.f84205f;
        }
        tb.i iVar5 = creatorVisibility;
        tb.i fieldVisibility = hVar.getFieldVisibility();
        if (fieldVisibility == iVar) {
            fieldVisibility = this.f84206g;
        }
        return a(iVar2, iVar3, iVar4, iVar5, fieldVisibility);
    }

    @Override // rc.j1
    public i1 withSetterVisibility(tb.i iVar) {
        if (iVar == tb.i.f86730g) {
            iVar = f84200h.f84204e;
        }
        tb.i iVar2 = iVar;
        if (this.f84204e == iVar2) {
            return this;
        }
        return new i1(this.f84202b, this.f84203c, iVar2, this.f84205f, this.f84206g);
    }

    @Override // rc.j1
    public i1 withVisibility(l1 l1Var, tb.i iVar) {
        int iOrdinal = l1Var.ordinal();
        return iOrdinal != 0 ? iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? iOrdinal != 7 ? this : with(iVar) : withCreatorVisibility(iVar) : withIsGetterVisibility(iVar) : withFieldVisibility(iVar) : withSetterVisibility(iVar) : withGetterVisibility(iVar);
    }

    @Override // rc.j1
    public i1 with(tb.j jVar) {
        if (jVar == null) {
            return this;
        }
        tb.i iVar = jVar.getterVisibility();
        tb.i iVar2 = tb.i.f86730g;
        if (iVar == iVar2) {
            iVar = this.f84202b;
        }
        tb.i iVar3 = iVar;
        tb.i iVarIsGetterVisibility = jVar.isGetterVisibility();
        if (iVarIsGetterVisibility == iVar2) {
            iVarIsGetterVisibility = this.f84203c;
        }
        tb.i iVar4 = iVarIsGetterVisibility;
        tb.i iVar5 = jVar.setterVisibility();
        if (iVar5 == iVar2) {
            iVar5 = this.f84204e;
        }
        tb.i iVar6 = iVar5;
        tb.i iVarCreatorVisibility = jVar.creatorVisibility();
        if (iVarCreatorVisibility == iVar2) {
            iVarCreatorVisibility = this.f84205f;
        }
        tb.i iVar7 = iVarCreatorVisibility;
        tb.i iVarFieldVisibility = jVar.fieldVisibility();
        if (iVarFieldVisibility == iVar2) {
            iVarFieldVisibility = this.f84206g;
        }
        return a(iVar3, iVar4, iVar6, iVar7, iVarFieldVisibility);
    }

    public i1(tb.i iVar, tb.i iVar2, tb.i iVar3, tb.i iVar4, tb.i iVar5) {
        this.f84202b = iVar;
        this.f84203c = iVar2;
        this.f84204e = iVar3;
        this.f84205f = iVar4;
        this.f84206g = iVar5;
    }

    public i1(tb.i iVar) {
        if (iVar == tb.i.f86730g) {
            i1 i1Var = f84200h;
            this.f84202b = i1Var.f84202b;
            this.f84203c = i1Var.f84203c;
            this.f84204e = i1Var.f84204e;
            this.f84205f = i1Var.f84205f;
            this.f84206g = i1Var.f84206g;
            return;
        }
        this.f84202b = iVar;
        this.f84203c = iVar;
        this.f84204e = iVar;
        this.f84205f = iVar;
        this.f84206g = iVar;
    }

    @Override // rc.j1
    public i1 with(tb.i iVar) {
        if (iVar == tb.i.f86730g) {
            return f84200h;
        }
        return new i1(iVar);
    }
}
