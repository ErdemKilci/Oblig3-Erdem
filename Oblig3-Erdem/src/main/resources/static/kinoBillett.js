let Tickets = [];

function buyTicket() {
    const film = $('#film').val();
    const antall = $('#antall').val();
    const fornavn = $('#fornavn').val();
    const etternavn = $('#etternavn').val();
    const telefonNummer = $('#telefonNummer').val();
    const epost = $('#epost').val();

    if (!film || !antall || !fornavn || !etternavn || !telefonNummer || !epost) {
        alert("All fields must be filled out");
        return false;
    }

    if (!/^\d+$/.test(antall)) {
        alert("Enter a valid amount");
        return false;
    }

    if (!/^\d{8,}$/.test(telefonNummer)) {
        alert("Enter a valid phone number");
        return false;
    }

    if (!/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+.[a-zA-Z]{2,6}$/.test(epost)) {
        alert("Enter a valid e-post address");
        return false;
    }

    let ticket = { film, antall, fornavn, etternavn, telefonNummer, epost };

    // add the tickets to ticket array
    Tickets.push(ticket);
    $('#film, #antall, #fornavn, #etternavn, #telefonNummer, #epost').val("");

    // show the tickets on the page
    showTickets();

    // clear the fields so another ticket can be bought afterwards
    clearFields();
    $.post("/save", ticket, function (data) {
        showTickets();
    });
}

function showTickets() {
    const ticketList = $('#ticketsAll');
    ticketList.empty();

    Tickets.forEach(function(ticket) {
        const ticketInfo = $('<div>').text(`Film: ${ticket.film}, Antall: ${ticket.antall}, Navn: ${ticket.fornavn} ${ticket.etternavn}, Telefonnummer: ${ticket.telefonNummer}, E-post: ${ticket.epost}`);
        ticketList.append(ticketInfo);
    });

}

function clearFields() {
    $('#film').val('');
    $('#antall').val('');
    $('#fornavn').val('');
    $('#etternavn').val('');
    $('#telefonNummer').val('');
    $('#epost').val('');
}

function removeTickets() {
    Tickets = [];
    showTickets();
}

function getAllTickets() {
    $.get("/getAll", function (data) {
        showTickets();
    });
}

function deleteAllTickets() {
    Tickets = [];
    showTickets();
    $.get("/deleteAll", function () {
        getAllTickets()
    })
}



