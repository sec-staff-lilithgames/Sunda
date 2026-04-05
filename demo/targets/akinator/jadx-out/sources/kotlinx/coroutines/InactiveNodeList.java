package kotlinx.coroutines;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class InactiveNodeList implements Incomplete {
    private final NodeList list;

    public InactiveNodeList(NodeList nodeList) {
        this.list = nodeList;
    }

    @Override // kotlinx.coroutines.Incomplete
    public NodeList getList() {
        return this.list;
    }

    @Override // kotlinx.coroutines.Incomplete
    public boolean isActive() {
        return false;
    }

    public String toString() {
        return super.toString();
    }
}
