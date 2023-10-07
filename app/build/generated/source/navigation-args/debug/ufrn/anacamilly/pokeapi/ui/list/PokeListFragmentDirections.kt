package ufrn.anacamilly.pokeapi.ui.list

import android.os.Bundle
import androidx.navigation.NavDirections
import kotlin.Int
import kotlin.String
import ufrn.anacamilly.pokeapi.R

public class PokeListFragmentDirections private constructor() {
  private data class ActionPokeListFragmentToPokeDetailFragment(
    public val name: String = "\"\""
  ) : NavDirections {
    public override val actionId: Int = R.id.action_pokeListFragment_to_pokeDetailFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putString("name", this.name)
        return result
      }
  }

  public companion object {
    public fun actionPokeListFragmentToPokeDetailFragment(name: String = "\"\""): NavDirections =
        ActionPokeListFragmentToPokeDetailFragment(name)
  }
}
