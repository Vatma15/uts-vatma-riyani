package AgendaAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class AgendaAdapter extends RecyclerView.Adapter<AgendaAdapter.ViewHolder> {

    private ArrayList<Agenda> agendaList;

    public AgendaAdapter(ArrayList<Agenda> agendaList) {
        this.agendaList = agendaList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_agenda, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Agenda agenda = agendaList.get(position);
        holder.name.setText(agenda.getName());
        holder.description.setText(agenda.getDescription());
        holder.status.setText(agenda.getStatus());
    }

    @Override
    public int getItemCount() {
        return agendaList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, description, status;

        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tvName);
            description = itemView.findViewById(R.id.tvDescription);
            status = itemView.findViewById(R.id.tvStatus);
        }
    }
}
}