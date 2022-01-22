package langage;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Automate {
    @Getter
    final List<State> states = new ArrayList<>();
    @Getter @Setter
    State initial;
    private State current;
    public boolean check(String wordToCheck){
        this.current = this.initial;
        for (int i = 0; i < wordToCheck.length(); i++) {
            if(this.current.getTransitionTable().containsKey(wordToCheck.charAt(i))){
                this.current = this.current.getTransitionTable().get(wordToCheck.charAt(i));
            }else{
                return false;
            }
        }
        return this.current.getIsFinal();
    }
}
