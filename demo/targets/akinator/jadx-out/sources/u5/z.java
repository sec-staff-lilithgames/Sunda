package u5;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.e0;
import uu.c2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: e, reason: collision with root package name */
    public static final b f87940e = new b(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f87941a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f87942b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f87943c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f87944d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {
        public b(kotlin.jvm.internal.u uVar) {
        }

        @tu.f
        public final z read(y5.c database, String tableName) {
            e0.checkNotNullParameter(database, "database");
            e0.checkNotNullParameter(tableName, "tableName");
            return read(new r5.a(database), tableName);
        }

        public final z read(x5.b connection, String tableName) {
            e0.checkNotNullParameter(connection, "connection");
            e0.checkNotNullParameter(tableName, "tableName");
            return x.readTableInfo(connection, tableName);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f87953a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87954b;

        /* renamed from: c, reason: collision with root package name */
        public final String f87955c;

        /* renamed from: d, reason: collision with root package name */
        public final List f87956d;

        /* renamed from: e, reason: collision with root package name */
        public final List f87957e;

        public c(String referenceTable, String onDelete, String onUpdate, List<String> columnNames, List<String> referenceColumnNames) {
            e0.checkNotNullParameter(referenceTable, "referenceTable");
            e0.checkNotNullParameter(onDelete, "onDelete");
            e0.checkNotNullParameter(onUpdate, "onUpdate");
            e0.checkNotNullParameter(columnNames, "columnNames");
            e0.checkNotNullParameter(referenceColumnNames, "referenceColumnNames");
            this.f87953a = referenceTable;
            this.f87954b = onDelete;
            this.f87955c = onUpdate;
            this.f87956d = columnNames;
            this.f87957e = referenceColumnNames;
        }

        public boolean equals(Object obj) {
            return a0.equalsCommon(this, obj);
        }

        public int hashCode() {
            return a0.hashCodeCommon(this);
        }

        public String toString() {
            return a0.toStringCommon(this);
        }
    }

    public z(String name, Map<String, a> columns, Set<c> foreignKeys, Set<d> set) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(columns, "columns");
        e0.checkNotNullParameter(foreignKeys, "foreignKeys");
        this.f87941a = name;
        this.f87942b = columns;
        this.f87943c = foreignKeys;
        this.f87944d = set;
    }

    public static final z read(x5.b bVar, String str) {
        return f87940e.read(bVar, str);
    }

    public boolean equals(Object obj) {
        return a0.equalsCommon(this, obj);
    }

    public int hashCode() {
        return a0.hashCodeCommon(this);
    }

    public String toString() {
        return a0.toStringCommon(this);
    }

    @tu.f
    public static final z read(y5.c cVar, String str) {
        return f87940e.read(cVar, str);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final String f87958a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f87959b;

        /* renamed from: c, reason: collision with root package name */
        public final List f87960c;

        /* renamed from: d, reason: collision with root package name */
        public final List f87961d;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a {
            public a(kotlin.jvm.internal.u uVar) {
            }
        }

        static {
            new a(null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r5v1, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r5v2 */
        /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
        public d(String name, boolean z10, List<String> columns, List<String> orders) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(columns, "columns");
            e0.checkNotNullParameter(orders, "orders");
            this.f87958a = name;
            this.f87959b = z10;
            this.f87960c = columns;
            this.f87961d = orders;
            List<String> arrayList = orders;
            if (arrayList.isEmpty()) {
                int size = columns.size();
                arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add("ASC");
                }
            }
            this.f87961d = (List) arrayList;
        }

        public boolean equals(Object obj) {
            return a0.equalsCommon(this, obj);
        }

        public int hashCode() {
            return a0.hashCodeCommon(this);
        }

        public String toString() {
            return a0.toStringCommon(this);
        }

        @tu.f
        public d(String name, boolean z10, List<String> columns) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(columns, "columns");
            int size = columns.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add("ASC");
            }
            this(name, z10, columns, arrayList);
        }
    }

    public /* synthetic */ z(String str, Map map, Set set, Set set2, int i10, kotlin.jvm.internal.u uVar) {
        this(str, map, set, (i10 & 8) != 0 ? null : set2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @tu.f
    public z(String name, Map<String, a> columns, Set<c> foreignKeys) {
        this(name, columns, foreignKeys, c2.emptySet());
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(columns, "columns");
        e0.checkNotNullParameter(foreignKeys, "foreignKeys");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: h, reason: collision with root package name */
        public static final C0793a f87945h = new C0793a(null);

        /* renamed from: a, reason: collision with root package name */
        public final String f87946a;

        /* renamed from: b, reason: collision with root package name */
        public final String f87947b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f87948c;

        /* renamed from: d, reason: collision with root package name */
        public final int f87949d;

        /* renamed from: e, reason: collision with root package name */
        public final String f87950e;

        /* renamed from: f, reason: collision with root package name */
        public final int f87951f;

        /* renamed from: g, reason: collision with root package name */
        public final int f87952g;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: u5.z$a$a, reason: collision with other inner class name */
        public static final class C0793a {
            public C0793a(kotlin.jvm.internal.u uVar) {
            }

            public final boolean defaultValueEquals(String current, String str) {
                e0.checkNotNullParameter(current, "current");
                return a0.defaultValueEqualsCommon(current, str);
            }
        }

        public a(String name, String type, boolean z10, int i10, String str, int i11) {
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(type, "type");
            this.f87946a = name;
            this.f87947b = type;
            this.f87948c = z10;
            this.f87949d = i10;
            this.f87950e = str;
            this.f87951f = i11;
            this.f87952g = x.findAffinity(type);
        }

        public static final boolean defaultValueEquals(String str, String str2) {
            return f87945h.defaultValueEquals(str, str2);
        }

        public boolean equals(Object obj) {
            return a0.equalsCommon(this, obj);
        }

        public int hashCode() {
            return a0.hashCodeCommon(this);
        }

        public final boolean isPrimaryKey() {
            return this.f87949d > 0;
        }

        public String toString() {
            return a0.toStringCommon(this);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @tu.f
        public a(String name, String type, boolean z10, int i10) {
            this(name, type, z10, i10, null, 0);
            e0.checkNotNullParameter(name, "name");
            e0.checkNotNullParameter(type, "type");
        }

        public static /* synthetic */ void getAffinity$annotations() {
        }
    }
}
