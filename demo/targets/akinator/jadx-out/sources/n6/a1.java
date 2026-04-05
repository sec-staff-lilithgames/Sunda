package n6;

import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a1 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f75684e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final List f75685a;

    /* renamed from: b, reason: collision with root package name */
    public final List f75686b;

    /* renamed from: c, reason: collision with root package name */
    public final List f75687c;

    /* renamed from: d, reason: collision with root package name */
    public final List f75688d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }

        public final a1 fromIds(List<UUID> ids) {
            kotlin.jvm.internal.e0.checkNotNullParameter(ids, "ids");
            return new a1(ids, null, null, null, 14, null);
        }

        public final a1 fromStates(List<? extends x0> states) {
            kotlin.jvm.internal.e0.checkNotNullParameter(states, "states");
            return new a1(null, null, null, states, 7, null);
        }

        public final a1 fromTags(List<String> tags) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
            return new a1(null, null, tags, null, 11, null);
        }

        public final a1 fromUniqueWorkNames(String... uniqueWorkNames) {
            kotlin.jvm.internal.e0.checkNotNullParameter(uniqueWorkNames, "uniqueWorkNames");
            return new a1(null, uu.k0.toList(uniqueWorkNames), null, null, 13, null);
        }

        public final a1 fromIds(UUID... ids) {
            kotlin.jvm.internal.e0.checkNotNullParameter(ids, "ids");
            return new a1(uu.k0.toList(ids), null, null, null, 14, null);
        }

        public final a1 fromStates(x0... states) {
            kotlin.jvm.internal.e0.checkNotNullParameter(states, "states");
            return new a1(null, null, null, uu.k0.toList(states), 7, null);
        }

        public final a1 fromTags(String... tags) {
            kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
            return new a1(null, null, uu.k0.toList(tags), null, 11, null);
        }

        public final a1 fromUniqueWorkNames(List<String> uniqueWorkNames) {
            kotlin.jvm.internal.e0.checkNotNullParameter(uniqueWorkNames, "uniqueWorkNames");
            return new a1(null, uniqueWorkNames, null, null, 13, null);
        }
    }

    public a1() {
        this(null, null, null, null, 15, null);
    }

    public static final a1 fromIds(List<UUID> list) {
        return f75684e.fromIds(list);
    }

    public static final a1 fromStates(List<? extends x0> list) {
        return f75684e.fromStates(list);
    }

    public static final a1 fromTags(List<String> list) {
        return f75684e.fromTags(list);
    }

    public static final a1 fromUniqueWorkNames(List<String> list) {
        return f75684e.fromUniqueWorkNames(list);
    }

    public final List<UUID> getIds() {
        return this.f75685a;
    }

    public final List<x0> getStates() {
        return this.f75688d;
    }

    public final List<String> getTags() {
        return this.f75687c;
    }

    public final List<String> getUniqueWorkNames() {
        return this.f75686b;
    }

    public a1(List<UUID> ids, List<String> uniqueWorkNames, List<String> tags, List<? extends x0> states) {
        kotlin.jvm.internal.e0.checkNotNullParameter(ids, "ids");
        kotlin.jvm.internal.e0.checkNotNullParameter(uniqueWorkNames, "uniqueWorkNames");
        kotlin.jvm.internal.e0.checkNotNullParameter(tags, "tags");
        kotlin.jvm.internal.e0.checkNotNullParameter(states, "states");
        this.f75685a = ids;
        this.f75686b = uniqueWorkNames;
        this.f75687c = tags;
        this.f75688d = states;
    }

    public static final a1 fromIds(UUID... uuidArr) {
        return f75684e.fromIds(uuidArr);
    }

    public static final a1 fromStates(x0... x0VarArr) {
        return f75684e.fromStates(x0VarArr);
    }

    public static final a1 fromTags(String... strArr) {
        return f75684e.fromTags(strArr);
    }

    public static final a1 fromUniqueWorkNames(String... strArr) {
        return f75684e.fromUniqueWorkNames(strArr);
    }

    public /* synthetic */ a1(List list, List list2, List list3, List list4, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? uu.p0.emptyList() : list, (i10 & 2) != 0 ? uu.p0.emptyList() : list2, (i10 & 4) != 0 ? uu.p0.emptyList() : list3, (i10 & 8) != 0 ? uu.p0.emptyList() : list4);
    }
}
