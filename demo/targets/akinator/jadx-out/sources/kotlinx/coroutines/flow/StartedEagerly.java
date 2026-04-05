package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
final class StartedEagerly implements SharingStarted {
    @Override // kotlinx.coroutines.flow.SharingStarted
    public Flow<SharingCommand> command(StateFlow<Integer> stateFlow) {
        return FlowKt.flowOf(SharingCommand.START);
    }

    public String toString() {
        return "SharingStarted.Eagerly";
    }
}
