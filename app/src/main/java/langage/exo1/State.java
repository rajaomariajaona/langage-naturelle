package langage.exo1;

import lombok.*;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
public class State {
    @Setter @Getter @NonNull
    String name;
    @Setter @Getter @NonNull
    Boolean isFinal;
    @Getter
    final Map<Character, State> transitionTable = new HashMap<>();
}
