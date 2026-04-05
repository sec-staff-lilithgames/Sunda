package yc;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class s extends ub.y {

    /* renamed from: d, reason: collision with root package name */
    public final s f94343d;

    /* renamed from: e, reason: collision with root package name */
    public String f94344e;

    /* renamed from: f, reason: collision with root package name */
    public Object f94345f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends s {

        /* renamed from: g, reason: collision with root package name */
        public final Iterator f94346g;

        /* renamed from: h, reason: collision with root package name */
        public jc.t f94347h;

        public a(jc.t tVar, s sVar) {
            super(1, sVar);
            this.f94346g = tVar.elements();
        }

        @Override // yc.s
        public jc.t currentNode() {
            return this.f94347h;
        }

        @Override // yc.s, ub.y
        public /* bridge */ /* synthetic */ ub.y getParent() {
            return getParent();
        }

        @Override // yc.s
        public ub.z nextToken() {
            Iterator it = this.f94346g;
            if (!it.hasNext()) {
                this.f94347h = null;
                return ub.z.END_ARRAY;
            }
            this.f88379b++;
            jc.t tVar = (jc.t) it.next();
            this.f94347h = tVar;
            return tVar.asToken();
        }

        @Override // yc.s
        public s startArray() {
            return new a(this.f94347h, this);
        }

        @Override // yc.s
        public s startObject() {
            return new b(this.f94347h, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends s {

        /* renamed from: g, reason: collision with root package name */
        public final Iterator f94348g;

        /* renamed from: h, reason: collision with root package name */
        public Map.Entry f94349h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f94350i;

        public b(jc.t tVar, s sVar) {
            super(2, sVar);
            this.f94348g = tVar.properties().iterator();
            this.f94350i = true;
        }

        @Override // yc.s
        public jc.t currentNode() {
            Map.Entry entry = this.f94349h;
            if (entry == null) {
                return null;
            }
            return (jc.t) entry.getValue();
        }

        @Override // yc.s, ub.y
        public /* bridge */ /* synthetic */ ub.y getParent() {
            return getParent();
        }

        @Override // yc.s
        public ub.z nextToken() {
            if (!this.f94350i) {
                this.f94350i = true;
                return ((jc.t) this.f94349h.getValue()).asToken();
            }
            Iterator it = this.f94348g;
            if (!it.hasNext()) {
                this.f94344e = null;
                this.f94349h = null;
                return ub.z.END_OBJECT;
            }
            this.f88379b++;
            this.f94350i = false;
            Map.Entry entry = (Map.Entry) it.next();
            this.f94349h = entry;
            this.f94344e = entry != null ? (String) entry.getKey() : null;
            return ub.z.FIELD_NAME;
        }

        @Override // yc.s
        public s startArray() {
            return new a(currentNode(), this);
        }

        @Override // yc.s
        public s startObject() {
            return new b(currentNode(), this);
        }
    }

    public s(int i10, s sVar) {
        this.f88378a = i10;
        this.f88379b = -1;
        this.f94343d = sVar;
    }

    public abstract jc.t currentNode();

    @Override // ub.y
    public final String getCurrentName() {
        return this.f94344e;
    }

    @Override // ub.y
    public Object getCurrentValue() {
        return this.f94345f;
    }

    public final s iterateChildren() {
        jc.t tVarCurrentNode = currentNode();
        if (tVarCurrentNode == null) {
            throw new IllegalStateException("No current node");
        }
        if (tVarCurrentNode.isArray()) {
            return new a(tVarCurrentNode, this);
        }
        if (tVarCurrentNode.isObject()) {
            return new b(tVarCurrentNode, this);
        }
        throw new IllegalStateException("Current node of type ".concat(tVarCurrentNode.getClass().getName()));
    }

    public abstract ub.z nextToken();

    public void overrideCurrentName(String str) {
        this.f94344e = str;
    }

    @Override // ub.y
    public void setCurrentValue(Object obj) {
        this.f94345f = obj;
    }

    public abstract s startArray();

    public abstract s startObject();

    @Override // ub.y
    public final s getParent() {
        return this.f94343d;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends s {

        /* renamed from: g, reason: collision with root package name */
        public jc.t f94351g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f94352h;

        public c(jc.t tVar, s sVar) {
            super(0, sVar);
            this.f94352h = false;
            this.f94351g = tVar;
        }

        @Override // yc.s
        public jc.t currentNode() {
            if (this.f94352h) {
                return this.f94351g;
            }
            return null;
        }

        @Override // yc.s, ub.y
        public /* bridge */ /* synthetic */ ub.y getParent() {
            return getParent();
        }

        @Override // yc.s
        public ub.z nextToken() {
            if (this.f94352h) {
                this.f94351g = null;
                return null;
            }
            this.f88379b++;
            this.f94352h = true;
            return this.f94351g.asToken();
        }

        @Override // yc.s
        public s startArray() {
            return new a(this.f94351g, this);
        }

        @Override // yc.s
        public s startObject() {
            return new b(this.f94351g, this);
        }

        @Override // yc.s
        public void overrideCurrentName(String str) {
        }
    }
}
