package kotlinx.coroutines.slf4j;

import bx.d;
import java.util.Map;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.ThreadContextElement;
import zu.a;
import zu.l;
import zu.m;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class MDCContext extends a implements ThreadContextElement<Map<String, ? extends String>> {
    public static final Key Key = new Key(null);
    private final Map<String, String> contextMap;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class Key implements l {
        public /* synthetic */ Key(u uVar) {
            this();
        }

        private Key() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MDCContext() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final void setCurrent(Map<String, String> map) {
        if (map == null) {
            d.clear();
        } else {
            d.setContextMap(map);
        }
    }

    public final Map<String, String> getContextMap() {
        return this.contextMap;
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public /* bridge */ /* synthetic */ void restoreThreadContext(m mVar, Map<String, ? extends String> map) {
        restoreThreadContext2(mVar, (Map<String, String>) map);
    }

    public /* synthetic */ MDCContext(Map map, int i10, u uVar) {
        this((i10 & 1) != 0 ? d.getCopyOfContextMap() : map);
    }

    /* renamed from: restoreThreadContext, reason: avoid collision after fix types in other method */
    public void restoreThreadContext2(m mVar, Map<String, String> map) {
        setCurrent(map);
    }

    @Override // kotlinx.coroutines.ThreadContextElement
    public Map<String, ? extends String> updateThreadContext(m mVar) {
        Map<String, String> copyOfContextMap = d.getCopyOfContextMap();
        setCurrent(this.contextMap);
        return copyOfContextMap;
    }

    public MDCContext(Map<String, String> map) {
        super(Key);
        this.contextMap = map;
    }
}
