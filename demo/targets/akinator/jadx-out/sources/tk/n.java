package tk;

import com.google.longrunning.ListOperationsResponse;
import com.google.longrunning.Operation;
import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n extends GeneratedMessageLite.Builder implements o {
    public n addAllOperations(Iterable<? extends Operation> iterable) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).addAllOperations(iterable);
        return this;
    }

    public n addOperations(Operation operation) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).addOperations(operation);
        return this;
    }

    public n clearNextPageToken() {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).clearNextPageToken();
        return this;
    }

    public n clearOperations() {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).clearOperations();
        return this;
    }

    @Override // tk.o
    public String getNextPageToken() {
        return ((ListOperationsResponse) this.instance).getNextPageToken();
    }

    @Override // tk.o
    public ByteString getNextPageTokenBytes() {
        return ((ListOperationsResponse) this.instance).getNextPageTokenBytes();
    }

    @Override // tk.o
    public Operation getOperations(int i10) {
        return ((ListOperationsResponse) this.instance).getOperations(i10);
    }

    @Override // tk.o
    public int getOperationsCount() {
        return ((ListOperationsResponse) this.instance).getOperationsCount();
    }

    @Override // tk.o
    public List<Operation> getOperationsList() {
        return Collections.unmodifiableList(((ListOperationsResponse) this.instance).getOperationsList());
    }

    public n removeOperations(int i10) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).removeOperations(i10);
        return this;
    }

    public n setNextPageToken(String str) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).setNextPageToken(str);
        return this;
    }

    public n setNextPageTokenBytes(ByteString byteString) throws IllegalArgumentException {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).setNextPageTokenBytes(byteString);
        return this;
    }

    public n setOperations(int i10, Operation operation) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).setOperations(i10, operation);
        return this;
    }

    public n addOperations(int i10, Operation operation) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).addOperations(i10, operation);
        return this;
    }

    public n setOperations(int i10, q qVar) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).setOperations(i10, (Operation) qVar.build());
        return this;
    }

    public n addOperations(q qVar) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).addOperations((Operation) qVar.build());
        return this;
    }

    public n addOperations(int i10, q qVar) {
        copyOnWrite();
        ((ListOperationsResponse) this.instance).addOperations(i10, (Operation) qVar.build());
        return this;
    }
}
